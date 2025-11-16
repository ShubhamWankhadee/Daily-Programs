/*

Q8. Overload cleanMerge() —
Version 1: accepts one array, removes duplicates, and prints the cleaned array.


Version 2: accepts two arrays, removes duplicates from both, merges them, and prints the final array in ascending order.
Input 1: [1, 2, 2, 3, 3, 4] → Output: [1, 2, 3, 4]
Input 2: [1, 2, 3], [2, 3, 4] → Output: [1, 2, 3, 4]

*/


import java.util.*;
class Unique{
	public void analyze(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}		
		}
		int k=0;
		for(int i=0;i<arr.length;i++){
			
			 for(int j=i+1;j<arr.length;j++){
				 
				if(arr[i] == arr[j]){
					arr[j] = -1;
					 
				}
			 }
			 if(arr[i] != -1){
				 arr[k] =arr[i];
				 k++;
			 }
			  
		}
		for(int i=0;i<arr.length-count;i++){
			System.out.print(" "+arr[i]);
		}
	 
	}
	 
	public void analyze(){
		int arr1[] = {1, 2, 3};
		int arr2[] = {2, 3, 4};
		
			 
		System.out.println("Mearge array !");
		int c=0,n=0;;
		int arr[] = new int[arr1.length + arr2.length];
		for(int i =0;i<arr.length;i++){
			
			if(i<arr1.length){
				arr[c] = arr1[i];
				c++;
			}else{
				arr[c] = arr2[n];
				c++;
				n++;
			}
		}
		 analyze(arr);
	}
	
 
}

public class Q8{
 
		public static void main(String args[]){
			Unique obj = new Unique();
			int arr[] = {1, 2, 2, 3, 3, 4};

			// Call version 1: accepts one array
			System.out.print("Cleaned array: ");
			obj.analyze(arr);

			System.out.println("\n----------------");

			// Call version 2: merges two arrays and removes duplicates
			obj.analyze();
		  
	}
}