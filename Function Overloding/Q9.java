/*
Q9. Overload a function pairSum() —
Version 1: accepts one array and prints all pairs whose sum is even.


Version 2: accepts two arrays and prints all pairs (one from each array) whose sum is divisible by 5.
Input 1: [1,2,3,4] → Output: (1,3), (2,4)  
Input 2: [1,2,3], [7,8,9] → Output: (1,9), (2,8), (3,7)

*/

import java.util.*;
class Pair{
	public void pairSum(int arr[]){
		 for(int i=0;i<arr.length;i++){
			
			 for(int j=i+1;j<arr.length;j++){
				 
				if((arr[i]+arr[j])%2==0){
					System.out.println("("+arr[i]+" "+arr[j]+")");
				}
			 }
			  
		}
	 
	}
	 
	public void pairSum(int arr1[],int arr2[]){
		for(int i=0;i<arr1.length;i++){
			
			 for(int j=0;j<arr2.length;j++){
				 
				if((arr1[i]+arr2[j])%5==0){
					System.out.println("("+arr1[i]+" "+arr2[j]+")");
				}
			 }
			  
		}		
		
	
	}
 
}

public class Q9{
 
		public static void main(String args[]){
			Pair obj = new Pair();
			int arr[] = {1, 2, 3, 4};
			int arr1[] = {1,2,3};
			int arr2[] = {7,8,9};

			obj.pairSum(arr);

			System.out.println("\n----------------");

			 
			obj.pairSum(arr1,arr2);
		  
	}
}