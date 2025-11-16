/*
7. Delete an Element from a Specific Position
Concept: Shift elements to the left to overwrite the removed value.
 Use Case: Remove items from a list, logs, etc.
Input: arr = [10, 20, 30, 40, 50]
Size = 5
Array after deletion: [10, 20, 40, 50]

*/

import java.util.*;
public class Delete{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Element in Array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Position where Deleting Value:");
		int pos = sc.nextInt();
		 
		
		System.out.println("Print Original Array !");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}	
		
		for(int i=pos;i<arr.length-1;i++){
			 arr[i] =arr[i+1];
		}	
		System.out.println("\nPrint Perform Operation Array !");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(" "+arr[i]);
		}			
	}
}