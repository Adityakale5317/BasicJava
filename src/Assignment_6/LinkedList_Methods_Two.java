package Assignment_6;

import java.util.LinkedList;

public class LinkedList_Methods_Two {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>(); 
        list.add(10); 
        list.add(20); 
        list.add(30); 
        System.out.println("LinkedList:" + list); 
        System.out.println("The  remove first element is: " + list.removeFirst()); 
        // Displaying the final list 
        System.out.println("Final LinkedList:" + list); 
        
        //Remove last element
        System.out.println("The last element is removed: " + list.removeLast()); 
        System.out.println("Final LinkedList After remvoing last element:" + list); 
	}

}
