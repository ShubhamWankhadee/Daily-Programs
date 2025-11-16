// Mock Palindrome Check

import java.util.*;
public class Palindrome{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values in Array: ");
		for(int i =0;i<arr.length;i++){
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Print Original Array: ");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		// Enter logic
		boolean  flag = true;
		for(int i =0;i < arr.length;i++){
			 
				if(arr[i] != arr[arr.length-1-i]){
					
					System.out.println(" Array is not palindrome: ");
					flag = false;
					break;
				}
		}
		if(flag){
			System.out.println("\nArray is palindrome:");
			
		}
		
 
		
	}
}