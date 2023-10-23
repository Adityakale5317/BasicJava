package Basic_java;

public class Instance_Variable {
	
	public String name;
	public Instance_Variable() {
		this.name = "Aditya ";
	}
	public static void main(String[] args) {
		Instance_Variable n =  new Instance_Variable(); // object creation
		System.out.print(n.name);

	}

}
