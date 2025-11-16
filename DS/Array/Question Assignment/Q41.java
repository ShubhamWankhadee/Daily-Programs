/*
	
Q7. Write a java program to merge two arrays.

	Input - First Array :- 1 2 3 4 5
            Second Array :-  6 7 8 9 10 
	Output - 1 10 2 9 3 8 4 7 5 6

*/

import java.util.*;
public class Q41{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		 
		int arr1[] =new int[5];
		int arr2[] =new int[5];
		int arr3[] =new int[arr1.length+arr2.length];
		
		// firat Array
		System.out.println("Enter the values in first array:");
		for(int i=0;i<arr1.length;i++){
		  arr1[i] = sc.nextInt();
		}
		System.out.println("Original Array print:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(" "+arr1[i]);
		}
		
		// secound Array
		 System.out.println("\nEnter the values in Second array:");
		for(int i=0;i<arr2.length;i++){
		  arr2[i] = sc.nextInt();
		}
		System.out.println("Original Array print:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(" "+arr2[i]);
		}
		 int a=0,b=arr2.length-1;
		for(int i=0;i<arr3.length;i++){
			if(i%2==0){
				arr3[i] = arr1[a];
				a++;
				
			}else{
				arr3[i] = arr2[b];
				b--;
			}
			
		}
		System.out.println("\n Print Mearge Array:");
		for(int i=0;i<arr3.length;i++){
			
			System.out.print(" "+arr3[i]);
		}
		
	}
}
