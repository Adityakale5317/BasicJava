package Assignment_4_Inheritance;

//Problem Statement = write a program where two child class inherits all the properties from parent class

class Vehicle{
	void start() {
		 System.out.println("Vehicle Started !");
	}
	void stop() {
		 System.out.println("Vehicle stopped !");
	}
}

class Car extends Vehicle{
	void accelerate() {
		 System.out.println("Car is accelerating !");
	}
}

class SuperCar extends Car{
	void speed() {
		 System.out.println("Super car have extra speed..!");
	}
}
public class Assignment_four_InheritanceExapmple {

	public static void main(String[] args) {
		
		SuperCar myCar = new SuperCar();
		myCar.start(); //Inherited
		
		myCar.accelerate();//Inherited
		
		myCar.speed(); //Defined in SuperCar
		myCar.stop(); // Inherited
		
	}

}
