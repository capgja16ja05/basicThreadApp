package p2;

public class MainApp {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		UserThread ramesh = new UserThread(p, "File 1");
		UserThread amit = new UserThread(p, "File 2");
		UserThread ram = new UserThread(p, "File 3");
		
		
		
		
		
	}
}
