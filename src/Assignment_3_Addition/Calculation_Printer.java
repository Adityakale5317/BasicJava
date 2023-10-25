package Assignment_3_Addition;

import java.util.Scanner;

public class Calculation_Printer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Addition addition =  new Addition(); 
		
		System.out.print("Enter first number :");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter Second number :");
		int num2 = scanner.nextInt();
		
		int sum =  addition.add(num1, num2);
		
		System.out.print("Sum of " + num1 + " and " + num2 +" = " +sum);
		
	}

}
