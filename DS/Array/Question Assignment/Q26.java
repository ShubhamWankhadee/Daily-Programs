/*
Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/

import java.util.*;
public class Q26
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values in Array:");
		int arr[] = new int [5];
		for(int i=0;i<arr.length;i++){
			  arr[i] = sc.nextInt();
		}
		System.out.print("Before perform Operation:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	 
 
		  for(int i=0;i<arr.length-1;i++){
			  
			  if(arr[i] % 3 == 0){  
				  arr[i] = -1;
			  }
		  }
		  
		  System.out.print("\n After Replace by 0 :");
		  for(int i=0;i<arr.length;i++){
			  System.out.print(" "+arr[i]);
		  }

 	}
}