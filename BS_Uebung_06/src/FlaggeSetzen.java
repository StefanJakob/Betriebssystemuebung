public class FlaggeSetzen {
	
	static boolean p1Bereit = false;
	static boolean p2Bereit = false;
	static Konto konto = new Konto();
	
	static Thread firstThread = new Thread(new Runnable() {
		public void run() {
//			try {
//				while (true) {
//					/**
//					 * Code einfügen
//					 */
//				}
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	});
	static Thread secondThread = new Thread(new Runnable() {
		public void run() {
//			try {
//				while (true) {
//					/**
//					 * Code einfügen
//					 */
//				}
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	});

	public static void main(String[] args) {
		try {
			konto.setKontostand(100);
			firstThread.start();
			Thread.sleep(18);
			secondThread.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}