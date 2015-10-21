public class ThreadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread firstThread = new Thread( 
				new Runnable() {
					public void run() {
				
						for (int i = 0; i < 100; i++) {
							System.out.println("I'm thread 1");		
						}
				
				

						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}


				
				System.out.println("Still in thread 1");
			};
		});
		
		firstThread.start();
		
		try {
			firstThread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println("I'm the main thread");
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Still in the main thread");

	}

}
