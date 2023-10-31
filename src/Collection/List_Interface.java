package Collection;

import java.util.*;

public class List_Interface {

	public static void main(String[] args) {
		 
		List <Integer> l1 = new ArrayList<Integer>();
		
		//Adding elements in object of list
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(50);
		
		System.out.println("Iniatial ArrayList :" +l1);
		
		l1.add(3, 40);
		
		System.out.println("Updated ArrayList :" +l1);
		

	}

}
