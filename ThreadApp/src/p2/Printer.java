package p2;

public class Printer {
	
	// public synchronized void doPrint(String msg)
	 public void doPrint(String msg)
	{
		System.out.println("A");  // login or security or logger
		synchronized (this) {
			System.out.println("["); // start of page
			System.out.println(msg);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				
				System.out.println(e);
			}
			System.out.println("]"); // end of page
		}//end of synch block
		
		System.out.println("B"); // shut down / logout task
	}

}
