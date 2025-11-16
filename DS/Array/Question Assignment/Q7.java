/*
Q2. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/

import java.util.*;
public class Q7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in Array:");
		int arr[] = new int[6];
		int i,temp=0;
		 // to taking input
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		// Array print
		System.out.println("Array print ist:");
		for(i=0;i<arr.length;i++)
		{
			
			System.out.print(" "+arr[i]);

			
		}
		// swap first and last digit
		for (  i = 0; i < arr.length / 2; i++) {
			  temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
			
		System.out.println("\nArray After perform Op:");
		for(i=0;i<arr.length;i++)
		{
			
			System.out.print(" "+arr[i]);

			
		}
		
		
		
		
		
		
		
		
		
		/*
		// Firast approch
		System.out.println("Reverse Arrya print:");
		for(i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		 
		
		// Secoutn approch
		System.out.println("Reverse Arrya print:");
		for(i=arr.length-1;i>=0;i--){
			arr2[5-a] =arr[i];
			a++;
		}
		for(i=0;i<a.length;i++){
			System.out.print(arr2[i]+" ");
		}
		*/
		
		
		
		 
		
	}

}