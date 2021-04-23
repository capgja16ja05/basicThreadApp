package p1;

public class MainApp {

	public static void main(String[] args) {
		//#1
		B obj1 = new B();
		Thread t = new Thread(obj1);
		t.start();
		
		//#2
		new Thread(obj1).start();
		
		//#3
		B obj3 = new B("Printing");
		
	}
}
