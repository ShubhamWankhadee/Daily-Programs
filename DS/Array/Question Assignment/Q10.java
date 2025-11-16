/*
Q5. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
*/

import java.util.*;
public class Q10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in Array");
		int arr[] = new int[5];
		int i =0;
		
		for(i =0;i<arr.length;i++){
				arr[i] = sc.nextInt();
				
		}
		System.out.print("Original Array is:");
		for(i =0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nEnter the Delete Index:");
		int dkey = sc.nextInt();

		 //  for the delete index value 
		 for (i = dkey; i < arr.length-1; i++) {    
			arr[i] = arr[i + 1]; // to move element in leftside
		 }

		System.out.print("\n After delete Element an Array:");
		for(i=0;i<arr.length-1;i++){
	 		System.out.print(" "+arr[i]);
		}
		 
		

		
	}
}