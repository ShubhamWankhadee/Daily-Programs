/*
Q2. Write a Java program to count the frequency of each element in an array using a function.
Example Input:
arr = {1, 2, 2, 3, 1, 4, 2}
Output:
1 → 2 times  
2 → 3 times  
3 → 1 time  
4 → 1 time

*/

import java.util.*;
public class Q2{
	static int max =0;
	static int max1=0;
		
	public static void Large(int arr[],int i){
			if(i <arr.length){ 
				int count=1;
				for(int j=i+1;j<arr.length;j++){	
					if(arr[i] == arr[j]){
							arr[j]= -1;
							count++;		
					}	
				}
				if(arr[i] != -1){
					System.out.println(arr[i]+"-->"+count+"times");
				}		
				Large(arr,i+1); // Recursion
			}		
	}
	public static void main(String args[]){
		int arr[] = {1, 2, 2, 3, 1, 4, 2};
		  int i= 0;
		Large(arr,i);
	 
	}
}