package Collection;

import java.util.ArrayList;
import java.util.Arrays;

/*Input: List = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
Output: List = [1, 10, 2, 3, 4, 5]
*/
public class Remove_Duplicates_ArrayList {
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
		
		ArrayList<T> newlist=  new ArrayList<T>();
		
		//Traverse through the first arraylist
		for(T element : list) {
			//if this elements is not present in list add it
			if(!newlist.contains(element)) {
				newlist.add(element);
				
			}
		}
		return newlist;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		
		System.out.println("ArrayList with duplicates: "+ list);
		
		//Remove Duplicates
		ArrayList<Integer> newlist = removeDuplicates(list);
		
		System.out.println("ArrayList with duplicates removed: "+ newlist); 
	}

}