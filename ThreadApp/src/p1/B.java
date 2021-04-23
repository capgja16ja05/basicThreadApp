package p1;

public class B implements Runnable 
{

	String x;
	Thread t;
	
	B()
	{
		
	}
	
	B(String x)
	{
		this.x = x;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
	
		System.out.println(" inside run "+x);
		
	}
	
}
