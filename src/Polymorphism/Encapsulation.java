package Polymorphism;

public class Encapsulation {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Name is : "+name);
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		e.setName("Aditya");
		e.setAge(27);

	}

}
