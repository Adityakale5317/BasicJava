package Polymorphism;

class Bike{
	void run() {
		System.out.println("Running");
	}
	
}

class Java extends Bike{
	void run() {
	System.out.println("Drive Safely");
	
	}
}

public class Method_Overrideing {

	public static void main(String[] args) {
		
		Bike b = new Java();
		b.run();
	}

}
