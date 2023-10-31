package Collection;

import java.util.*;

public class Removing_Elements_List {

	public static void main(String[] args) {
		
		List <String> al = new ArrayList<String>();
		
		al.add("Cristiano");
		al.add("Raul");
		al.add("Ricardo");
		al.add("Pepe");
		
		System.out.println("Portugal Fifa team :" + al);
		
		al.remove(1);
		System.out.print("New 2023 Portugal Fifa team :" + al);
	}

}
