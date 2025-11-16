/*

Q10. Overload operation() —
Version 1: accepts one array and prints all distinct elements (self-union).


Version 2: accepts two arrays and prints:


All elements in the intersection, and


All elements in the union.
Input 1: [1,2,2,3,4] → Output: Distinct Elements = [1,2,3,4]
Input 2: [1,2,3], [2,3,4] → Output: Intersection = [2,3], Union = [1,2,3,4]


*/


import java.util.*;
class Pair{
	public void pairSum(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){ 
				if(arr[i] == arr[j]){
					arr[j] = -1;	 
				}
			}
			if(arr[i] != -1){
				System.out.print(" "+arr[i]);
			}
		}
	 
	 
	}
	 
	public void pairSum(int arr1[],int arr2[]){
		for(int i=0;i<arr1.length;i++){
			
			 for(int j=0;j<arr2.length;j++){
				 
				if(arr1[i]==arr2[j]){
					System.out.print(" "+arr1[i]);
				}
			 }
			  
		}		
		
	
	}
 
}

public class Q10{
 
		public static void main(String args[]){
			Pair obj = new Pair();
			int arr[] = {1,2,2,3,4};
			int arr1[] = {1,2,3};
			int arr2[] = {2,3,4};

			obj.pairSum(arr);

			System.out.println("\n----------------");

			 
			obj.pairSum(arr1,arr2);
		  
	}
}