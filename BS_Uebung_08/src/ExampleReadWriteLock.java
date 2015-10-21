

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ExampleReadWriteLock {

	public static void main(String[] args) {
		
		final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		final Lock readLock = lock.readLock();
		final Lock writeLock = lock.writeLock();

		class Leser implements Runnable {
			public void run() {
				/**
				 * Insert code here
				 */
			}
		}

		class Schreiber implements Runnable {
			public void run() {
				/**
				 * Insert code here
				 */
			}
		}
		
		
		// Einige Leser und Schreiber:
		new Thread(new Leser()).start();
		new Thread(new Leser()).start();
		new Thread(new Schreiber()).start();
		new Thread(new Schreiber()).start();
	}
}
