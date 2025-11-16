/*
Q4. Write a java program to copy one array to another array.
Input:
Array1 = {5, 10, 15, 20}
Output:
Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.

*/

public class Q9{
	public static void main(String args[]){
		int arr[] = {5,10,15,20};
		
		System.out.print("Array print :");
		for(int i =0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		// Copy one array to another array
		int arr2[] = new int[arr.length];
		for(int i =0;i<arr.length;i++){
			arr2[i] = arr[i];
		}
		System.out.print("\n Copy Array is print:");
		for(int i =0;i<arr2.length;i++){
			
			System.out.print(" "+arr2[i]);
		}
	}
}