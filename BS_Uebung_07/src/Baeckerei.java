import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Baeckerei {

	private final Queue<String> auslage = new LinkedList<String>();
	private final Lock lock = new ReentrantLock();
	private final Condition notFull = lock.newCondition();
	private final Condition notEmpty = lock.newCondition();

	public static void main(String[] args) {
		final Baeckerei baeckerei = new Baeckerei();

		class Produzent implements Runnable {

			public void run() {
				try {
					while (true) {
						TimeUnit.MILLISECONDS
								.sleep(new Random().nextInt(1000) + 100);
						baeckerei.anbieten();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		class Konsument implements Runnable {

			public void run() {
				try {
					while (true) {
						TimeUnit.MILLISECONDS
								.sleep(new Random().nextInt(1000) + 100);
						baeckerei.konsumieren();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		Thread produzent1 = new Thread(new Produzent());
		Thread produzent2 = new Thread(new Produzent());

		Thread konsument1 = new Thread(new Konsument());
		Thread konsument2 = new Thread(new Konsument());

		produzent1.start();
		produzent2.start();
		konsument1.start();
		konsument2.start();
	}

	public void anbieten() {
		lock.lock();
		try {
			while (auslage.size() == 5) {
				System.out.println("Auslage voll -> Warten");
				notFull.await();
			}
			String keks = "Keks";
			auslage.add(keks);
			System.out.println(keks + " hinzugefügt.");
			notEmpty.signal(); //signalAll() auch möglich
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void konsumieren() {
		lock.lock();
		try {
			while (auslage.size() == 0) {
				System.out.println("Keine Kekse -> Warten");
				notEmpty.await();
			}
			String keks = auslage.poll();
			System.out.println(keks + " konsumiert.");
			notFull.signal(); //signalAll() auch möglich
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
