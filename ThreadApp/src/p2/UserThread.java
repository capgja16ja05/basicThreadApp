package p2;

public class UserThread implements Runnable {

	Printer p;
	Thread t;
	String msg;
	
	
	public UserThread(Printer p,String msg) {
		this.p = p;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		
		// call resource task from run()
		p.doPrint(msg);
	}

}
