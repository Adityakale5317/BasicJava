package Assignment_6_Access_Modifier;

class TestExample {
	   final int value = 10;
	   final int BOXWIDTH = 6;
	   final String TITLE = "Manager";
	   
	   public final void changeName() {
	      System.out.println("This is a final method");
	   }
	}


public class Access_Modifier_with_Final_Keyword  extends TestExample{
	public static void main(String args[]) {
	
	Access_Modifier_with_Final_Keyword obj = new  Access_Modifier_with_Final_Keyword (); 
	System.out.println(obj.value);
    System.out.println(obj.BOXWIDTH);
    System.out.println(obj.TITLE);
    obj.changeName();
	
	}
}
