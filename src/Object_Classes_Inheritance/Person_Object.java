package Object_Classes_Inheritance;

public class Person_Object {

	private String name;
	private int age;
	
	public Person_Object (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setname() {
		this.name =  name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge() {
		this.age = age;
	}
	
	public void PrintDetails() {
		System.out.println("Hello !! I'm " + name + "& i'm " +  age + "year old");
	}
	
	public static void main(String[] args) {
		//creating object
		Person_Object p1 = new Person_Object("Aditya",27);
		Person_Object p2 = new Person_Object("Sahil", 25);
		
		//
		p1.PrintDetails();
		p2.PrintDetails();
	}
}
