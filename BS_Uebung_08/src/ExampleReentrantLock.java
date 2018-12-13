

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleReentrantLock {
	
	static int rc = 0;

	public static void main(String[] args) {
		
		final ReentrantLock lock = new ReentrantLock();
		final Condition waitCondition = lock.newCondition();
		
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
