/*
Q7. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :                                           200

	Expected Output : The new list is : 1 2 200 3 4 5
*/


import java.util.*;
public class Q12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		int arr[] =  new int[size];
		int i=0;
		// Enter Value in Array
		System.out.println("Enter the Value in Array:");
		
		for(i=0;i<arr.length-1;i++){
			arr[i] = sc.nextInt();
			
		}
		// Print Original Array
		System.out.println("Original Array is:");
		
		for(i=0;i<arr.length-1;i++){
			System.out.print(" "+arr[i]);
			
		}
		// Where you insert Value put index
		System.out.println("\nEnter the position where to insert:");
			int pos = sc.nextInt();
			
		// put value in Array
		System.out.println("Enter the value to insert:");
		int value = sc.nextInt();
			
		for(i = arr.length - 1; i > pos; i--) {
			arr[i] = arr[i - 1];  // to move element in right side
		}
		arr[pos] = value; 
			 
			 
		// After insert the array	
		System.out.println("After Perform Op Array is:");
		for(i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
			
		}
			
		
	}
	
}