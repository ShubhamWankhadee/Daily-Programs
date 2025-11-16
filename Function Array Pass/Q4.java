/*
Q4.Write a Java program to check if two arrays are equal (same elements in same order) using a function.
Example Input:
a = {1, 2, 3, 4}
b = {1, 2, 3, 4}
Output:
Arrays are equal.

*/
 
 
public class Q4{
		 
	public static void Equal(int arr1[],int arr2[],int i){
 
	 
			 if(arr1[i] != arr2[i]){
				System.out.println("Array is not Equal!");
					 
			}else {
				System.out.println("Array is Equal!");
			}else(i<arr1.length-1){
				Equal(arr1,arr2,i+1);
			}
	 
		
		
	}
	public static void main(String args[]){
	
		int arr1[] = {1, 8, 3, 4};
		int arr2[] = {1, 2, 3, 4};
		int i=0;
		Equal(arr1,arr2,i);
		
	}
}