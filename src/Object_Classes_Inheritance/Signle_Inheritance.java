package Object_Classes_Inheritance;

class Animal{
		String name = "Shadow";
	
	
}

class Signle_Inheritance extends Animal {
    String breed = "French Mastiff"; 
	
	public static void main(String[] args) {
		Signle_Inheritance a  = new Signle_Inheritance();
		
		 System.out.println("My dog name is " + a.name);
		 System.out.println("Dog breed is " + a.breed);

	}

}
