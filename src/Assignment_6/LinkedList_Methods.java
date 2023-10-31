package Assignment_6;

import java.util.LinkedList;

public class LinkedList_Methods {

	public static void main(String[] args) {
		
		LinkedList <String> list = new LinkedList<>();
		
		//Adding element to the linked list
		
		list.add("India");
		list.add("Portugal");
		list.add("Spain");
		list.add("Britain");
		
		System.out.println(list);
		
		//Access element by index
		String firstCountry = list.get(0);
		System.out.println("First Country :" + firstCountry);
		
		//Remove Element By Value
		list.remove(2);
		System.out.println("After removing element :"+list);
		
		//Iterate through the linkedlist
		for(String countries : list) {
			System.out.print(" " +countries);
		}
		System.out.println();
		//Linked List to Array by using toArray();
		
		Object[] arr = list.toArray();
		System.out.print("After converted linked list to array: ");
		for(Object element: arr ) {
			System.out.print(element+" ");
		}
	}

}
