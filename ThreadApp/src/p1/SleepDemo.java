package p1;

public class SleepDemo {

	public static void main(String[] args) {
		System.out.println(" == My Clock ==");
		
		int hours = 0;
		int min = 0;
		int sec = 0;
		
		
		while(hours<24)
		{
			min = 0;
			while(min<60)
			{
				sec = 0;
				while(sec<60)
				{
					
					try
					{
						System.out.println(hours+" : "+min+" : "+sec);
						Thread.sleep(10);
						
					}
					catch(InterruptedException e)
					{
						System.out.println(e);
					}
					sec++;
				}
				min++;
					
			}
			hours++;
		}
		
		
		
		
		
		
	}
}
