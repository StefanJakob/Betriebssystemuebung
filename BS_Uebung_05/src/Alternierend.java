public class Alternierend {
	static Konto konto;
	static int prozess;

	public static void main(String[] args) {
		konto = new Konto();
		konto.setKontostand(100);
		prozess = 1;
		Thread firstThread = new Thread(new Runnable() {
			public void run() {
//				try {
//				while (true) {
//					/**
//					 * Code einfügen
//					 */
//				}
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			};
		});
		Thread secondThread = new Thread(new Runnable() {
			public void run() {
//				try {
//					while (true) {
//						/**
//						 * Code einfügen
//						 */
//					}
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			};
		});
		firstThread.start();
		secondThread.start();
	}
}