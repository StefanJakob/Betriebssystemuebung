import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
	static Semaphore semaphore = new Semaphore(3, true);

	static Runnable r = new Runnable() {
		public void run() {
			while (true) {
				try {
					semaphore.acquire();
					try {
						
						System.out.println(Thread.currentThread().getName()
								+ ", semaphore = " + semaphore.availablePermits());
						
						TimeUnit.SECONDS.sleep(3);
						
					} finally {
						semaphore.release();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
					Thread.currentThread().interrupt();
					break;
				}
			}
		}
	};

	public static void main(String[] args) {
		
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();

	}
}