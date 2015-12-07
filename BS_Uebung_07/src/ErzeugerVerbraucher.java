import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.*;

public class ErzeugerVerbraucher {

	private final Queue<String> itemqueue = new LinkedList<String>();
	private final Lock lock = new ReentrantLock();
	private final Condition notFull = lock.newCondition();
	private final Condition notEmpty = lock.newCondition();

	public static void main(String[] args) {
		final ErzeugerVerbraucher erzeugerVerbraucher = new ErzeugerVerbraucher();

		class Produzent implements Runnable {

			public void run() {
//				try {
//					while (true) {
//						/**
//						 * Insert code here.
//						 */
//					}
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}

		class Konsument implements Runnable {

			public void run() {
//				try {
//					while (true) {
//						/**
//						 * Insert code here.
//						 */
//					}
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
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

		/**
		 * Insert code here.
		 */

	}

	public void konsumieren() {

		/**
		 * Insert code here.
		 */

	}
}
