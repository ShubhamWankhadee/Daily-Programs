/*
Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. 
 Middle elements remain the same.
*/


import java.util.*;
public class Q27
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		System.out.println("Enter the Value of Array:");
		int arr[] = new int[size];
	   
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();	
		}
		System.out.println("Print Orijinal Array");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);	
		}
 
		 for(int i=0;i<arr.length;i++){
			  
			  if((i == 0) || (i == arr.length-1)){  
				  arr[i] = 0;
			  }
		  }
		  
		  System.out.print("\n After Replace by 0 :");
		  for(int i=0;i<arr.length;i++){
			  System.out.print(" "+arr[i]);
		  }

 	}
}