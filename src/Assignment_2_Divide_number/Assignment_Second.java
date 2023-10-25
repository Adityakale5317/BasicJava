package Assignment_2_Divide_number;

import java.util.Scanner;

//Problem statement - Write a program to divide number by given integer and handle the case where divider is Zero.
public class Assignment_Second {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter the number :");
			double number =  scanner.nextDouble();
			
			System.out.print("Enter the divisor :");
			int divisor = scanner.nextInt();
			
			double result =  number / divisor;
			System.out.print("Result :"+ result);
		}
		
		catch(Exception e) {
			System.out.print(e);
		}
		
		finally {
			scanner.close();
		}

	}

}
