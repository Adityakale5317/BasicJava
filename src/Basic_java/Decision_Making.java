package Basic_java;

public class Decision_Making {
	
	public static void if_block()
	{
		int age = 18;
		
		if(age > 17) {
			System.out.print("Enter into block");
		}
		
	}
	
	public static void if_else_block() {
		int age = 16;
		if(age >= 18 ) {
			System.out.print("You are an adult");
		}
		
		else {
			System.out.print("You are not yet adult");
		}
	}
	
	
	public static void nested_if() {
		int i = 10;
		
		if(i == 10 || i < 15 ) {
			if(i < 15) 
				System.out.println("i is smaller than 15");
			
			if(i < 11)
				System.out.println("i is smaller than 11");
		}
		else {

            System.out.println("i is greater than 15");
		}
	}
	
	public static void switch_condition() {
		int age = 27;
		switch (age) {
		case 11 : System.out.print("It is 11");
				  break;
		case 18 : System.out.print("It is 18");
				  break;
		case 25 : System.out.print("It is 25");
				  break;
		case 27 : System.out.print("It is 27");
				  break;
		case 29 : System.out.print("It is 29");
				  break;
		}
	}
	
	public static void jump_continue() {
		for(int i =0;i<=10;i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		//if_block();
		//if_else_block();
		//nested_if();
		
		switch_condition();
		jump_continue();
	}

}
