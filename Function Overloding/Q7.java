/*
Q7. Create an overloaded function analyze() —
Version 1: accepts one array and displays all unique (non-repeating) elements.


Version 2: accepts two arrays and prints all common elements between them.
Input 1: [2, 3, 2, 4, 5] → Output: Unique: 3, 4, 5  
Input 2: [1, 2, 3], [3, 4, 5] → Output: Common: 3

*/


import java.util.*;
class Unique{
	public void analyze(int arr[]){
		 boolean flag =true;
		System.out.println("Unique elements is: ");
		for(int i=0;i<arr.length;i++){
			
			 for(int j=i+1;j<arr.length;j++){
				 
				if(arr[i] == arr[j]){
					arr[j] = -1;
					flag =false;
				}
			 }
			 if(arr[i] != -1 && flag == true){
				System.out.print(" "+arr[i]);
			 }
			 flag = true;
		}
	 
	 
	}
	public void analyze(int arr1[],int arr2[]){
		System.out.println();
		System.out.println(" Common elements is in Array : ");
		for(int i=0;i<arr1.length;i++){
			 for(int j=0;j<arr2.length;j++){
				if(arr1[i] == arr2[j]){
					 
					System.out.print(" "+arr1[i]);
				}
			 }
		}		 
		 
	}
	 
	
	
	
}
public class Q7{

	public static void main(String args[]){
		Unique obj = new Unique();
		int arr[] = {2, 3, 2, 4, 5};
		int arr1[] = {1, 2, 3};
		int arr2[] = {3, 4, 5};
			obj.analyze(arr);
			obj.analyze(arr1 ,arr2);
		 
		  
	}
}