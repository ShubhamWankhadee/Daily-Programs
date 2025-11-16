/*
Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.

*/

import java.util.*;
public class Q16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
 		int i,j,no;
		 
		int arr[] =  {1, 2, 2, 3, 3, 3, 4,3,10};
		
	 
		for(i=0;i<arr.length;i++)
		{	int count=0;
			 
			no =arr[i];
				  for(j=0;j<arr.length;j++)
				  { 
						if(no == arr[j])
						{
							count++;
							// to set value -1
							arr[j]=-1;
						}
				 
				  } 
				 if(no!=-1)
				  {System.out.println(no+"-->"+ count +"times");}
			

		  
		}
	 
	}
}