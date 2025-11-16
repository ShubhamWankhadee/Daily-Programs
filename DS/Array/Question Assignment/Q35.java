/*
Q1. Write a program in java to print next greater elements in a given unsorted array.
 Elements for which no greater element exists, 
consider the next greater element as -1.
		Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1

*/

import java.util.*;
public class Q35{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.print("\n Enter the value in Array:");
		for(int i =0;i<arr.length;i++){
			arr[i] =  sc.nextInt();
		}
		 
		for(int i=0;i<arr.length;i++){
			for(int j =i+1;j<arr.length;j++){
				 
				 if(arr[i]<arr[j]){
					 System.out.println("Next bigger element of "+arr[i] +"in the array is: "+arr[j]);
					 break;
				 }  
			} 
			if(arr[i] == arr[arr.length-1]){
				   int no=-1;
				   System.out.println("Next bigger element of "+arr[i] +"in the array is: "+no);
		    }
			
		}
	}
}