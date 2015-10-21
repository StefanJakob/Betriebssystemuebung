import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class KonditorenAufgabe {
	
	static Queue<String> queue = new LinkedList<String>();

	static Semaphore mutex = new Semaphore(1, true);
	static Semaphore leer = new Semaphore(5);
	static Semaphore belegt = new Semaphore(0);
	
	static Runnable konditor1 = new Runnable() {
		public void run() {
			/**
			 * Code einfügen
			 */
		}
	};
	
	static Runnable konditor2 = new Runnable() {
		public void run() {
			
			/**
			 * Code einfügen
			 */
		}
	};
	
	static Runnable verbraucher = new Runnable() {
		public void run() {
			
			/**
			 * Code einfügen
			 */
		}
	};

	
	public static void main(String[] args) {
		
		new Thread(konditor1).start();
		new Thread(konditor2).start();
		new Thread(verbraucher).start();

	}
}