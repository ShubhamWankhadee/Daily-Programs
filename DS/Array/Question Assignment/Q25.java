/*
Q5. Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
*/


import java.util.*;
public class Q25
{
	public static void main(String args[])
	{
		int arr[] = {2, -3, 4, -1, 5};
 
		  for(int i=0;i<arr.length-1;i++){
			  
			  if(arr[i] <0){  
				  arr[i] = 0;
			  }
		  }
		  
		  System.out.print("\n After Replace by 0 :");
		  for(int i=0;i<arr.length;i++){
			  System.out.print(" "+arr[i]);
		  }

 	}
}