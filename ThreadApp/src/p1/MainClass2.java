package p1;


class DemoThread implements Runnable
{
	public void run()
	{
		for(int i = 1;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		
		DemoThread dt = new DemoThread();
		Thread t = new Thread(dt,"Thread-1");
		t.start();
		
		for(int i = 1;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		
	}
}
