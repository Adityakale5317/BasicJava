package Assignment_6_Access_Modifier;

class Football_Players{
	String name;
	int age;
	String country;
	
	Football_Players(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}
	void display() {
		System.out.println("My name is " + name + " I'm Playing for " + country +" And I'm "+age +"year old.");
	}
}
public class This_Keyword {

	public static void main(String[] args) {
		Football_Players p1 = new Football_Players("Cristiano",38,"portugal");
		p1.display();
		

	}

}
