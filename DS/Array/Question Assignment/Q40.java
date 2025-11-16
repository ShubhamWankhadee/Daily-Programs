/*
Q6. Write a java program to find the unique value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 3, 20, 12, 10 

*/

import java.util.*;
public class Q40{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter the values in array:");
		for(int i=0;i<arr.length;i++){
		  arr[i] = sc.nextInt();
		}
		System.out.println("Original Array print:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
			System.out.println(" \nUnque no is:");
			
		 for(int i=0;i<arr.length;i++){
			 boolean flag= true;
			 for(int j=0;j<arr.length;j++){
				 if(arr[i] == arr[j]&& i!= j) {
					 flag = false;
					 break;
				 }
			 } 
			 if(flag){
				 System.out.print(" "+arr[i]);
				 
			 }
				
		}

		
	}
}
