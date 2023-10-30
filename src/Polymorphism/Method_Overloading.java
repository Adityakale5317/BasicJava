package Polymorphism;

class Calculator{
	
	public  int division(int a, int b) {
		return a / b;
	}
	
	public  float division(float a, float b) {
		return a / b;
	}
}

public class Method_Overloading {

	public static void main(String[] args) {
		
		Calculator c =  new Calculator();
		System.out.println("Divison of numbers :" + c.division(25, 5));
		System.out.println("Divison of numbers :" + c.division(25.0f, 4.0f));

	}

}
