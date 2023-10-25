package Exception_Handling;

public class Throw_Keyword {
	
	public static void validate(int age) {
		
		if(age < 18) {
			throw new ArithmeticException("Person is not eligible to vote");   
		}
		else {
			System.out.print("person is eligible to vote");
		}
	}

	public static void main(String[] args) {
		
		validate(13);
		
	}

}
