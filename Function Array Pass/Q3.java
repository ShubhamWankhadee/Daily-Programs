/*
Q3. Write a Java program to reverse an array using a function.
Example Input:
arr = {5, 10, 15, 20, 25}
Output:
Reversed Array: 25 20 15 10 5


*/

import java.util.*;
public class Q3{
 
		
	public static void  Large(int arr[],int i){
		
			if(i <arr.length/2){ 
				
				// swaping
				int temp = arr[i];
				arr[i] = arr[arr.length-1-i];
				arr[arr.length-1-i] = temp;
				 
				Large(arr,i+1); // Recursion
			}else{
				System.out.print("Reverse Array print is: ");
				for(int j =0;j<arr.length;j++){
			
					System.out.print(" "+arr[j]);
				}
			} 
		 
	}
	public static void main(String args[]){
		int arr[] = {5, 10, 15, 20, 25};
		  int i= 0;
		 Large(arr,i);
		
 
	}
}