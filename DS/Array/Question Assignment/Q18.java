/*
Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  122  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 122 25 27 0 3  6 9

*/

import java.util.*;
public class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		 
		// put values in array
		System.out.println("Enter the values in Array:");
		for(int i =0;i<arr.length;i++){
			arr[i] = sc.nextInt(); 
		}
		// print original array
		System.out.println("Print original array:");
		for(int i =0;i<arr.length;i++){
			 	System.out.print(" "+arr[i]);
		}
		
		
		
		
		System.out.println("\nEnter the position:");
		int pos = sc.nextInt();
		// enter pos to distribut
		int arr1[] =new int[arr.length];
		     int k=0;
		 for(int i=pos;i<arr.length;i++)
		 {
			 arr1[k++]=arr[i];
   			 
		 }
		  
		 
		 for(int i=0;i<pos;i++)
		{
		  arr1[k++]=arr[i];
		}
		
		  
		
		
		// print before position values
		System.out.println("Print array after perform operation:");
		for(int i =0;i<arr1.length;i++){
			 System.out.print(" "+arr1[i]); 
		}
		
		 
	}
}