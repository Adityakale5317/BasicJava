package Assignment_6;

import java.util.Arrays;

/*Input: Array = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
Output: Array = [1, 10, 2, 3, 4, 5]
*/

public class Remove_Duplicates {
	
	public static int removeDuplicate(int arr[], int n) {
		
		int temp[] =  new int[n]; // declaring temp array
		int j = 0;
		for(int i =0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}	
		temp[j++] = arr[n-1];
		
		for(int i =0;i<j;i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		
		int arr[] = {1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5};
		
	     Arrays.sort(arr);//sorting array  
	        int length = arr.length;  
	        length = removeDuplicate(arr, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
	    }  
	}


