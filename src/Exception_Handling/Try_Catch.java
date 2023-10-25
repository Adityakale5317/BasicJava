package Exception_Handling;

public class Try_Catch {

	public static void main(String[] args) {
		try {
			int data = 100/0;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		//executed regardless of exception occurred or not  
		finally {
			System.out.println("finally block is always exceuted");
		}
	}

}
