import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ErzeugerVerbraucher {

	static Queue<String> queue = new LinkedList<String>();
	static Semaphore mutex = new Semaphore(1, true);
	static Semaphore leer = new Semaphore(5, true);
	static Semaphore belegt = new Semaphore(0, true);
	
	static Runnable konditor1 = new Runnable() {
		public void run() {
			while (true) {
				/**
				 * Code einfügen
				 */
			}
		}
	};
	
	static Runnable konditor2 = new Runnable() {
		public void run() {
			while (true) {
				/**
				 * Code einfügen
				 */
			}
		}
	};
	
	static Runnable verbraucher = new Runnable() {
		public void run() {
			while (true) {

				/**
				 * Code einfügen
				 */

			}
		}
	};
	
	public static String produziere() {return "Kuchen"; }

	public static void verbrauche(String stueck) {System.out.println("Verbrauche " + stueck);}

	public static void einfuegen(String stueck){ queue.offer(stueck); }

	public static String entnehmen(){ return queue.poll(); }
	
	public static void main(String[] args) {
		new Thread(konditor1).start();
		new Thread(konditor2).start();
		new Thread(verbraucher).start();
	}
}
