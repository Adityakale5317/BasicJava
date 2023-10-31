package Assignment_6;

public class Compare_Array_Size {
	
	public static void Compare_Arr(int []arr1, int []arr2) {
		boolean areEqualSize = (arr1.length == arr2.length);
		
			if(areEqualSize) {
			System.out.print("The two arrays are equal in size");
		}
			else
		    {
			System.out.print("Two arrays not equal in size");
		}
	
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,7,8};
		int arr2[] = {1,1,2,2};
		
		Compare_Arr(arr1, arr2);

}
}