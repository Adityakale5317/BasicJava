package Assignment_6;

import java.util.*;

public class ArrayList_Methods {

	public static void main(String[] args) {
		List <Integer> arraylist =  new ArrayList<Integer>();
		
		//Add elements to ArrayList
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		
		System.out.println("Array list with all elements :" + arraylist );
		
		//Access elements by index
		
		int firstElement = arraylist.get(0);
		System.out.println("First Element in Arrays List :" + firstElement);
		
		//Remove element by value
		arraylist.remove(1);
		System.out.println("Array list after removing index 1 :" + arraylist);
		
		//Add missing element 20
		
		arraylist.add(1,20);
		
		//print size of elements
		int size = arraylist.size();
		
		//Iterate through the arraylist
		for(Integer num : arraylist) {
			System.out.print( + num + " ");
		}
		System.out.println();
		System.out.println("Size of arraylist :"+ size);
	}

}
