/*
Q2.Write a java program count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3

*/

import java.util.*;
public class Q22
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
		
		// print original array
		System.out.println("Print Orijinal Array");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);	
		}
		int count=0;
		for(int j=0;j<arr.length;j++){
		 
			for(int i=j;i<arr.length;i++){
					if((arr[i] + arr[j]) == 6){
						count++;
						System.out.println("\nPair whose sum 6 : "+arr[j]+" "+arr[i]);
						
					}
			 
			}
		}
		System.out.println("Total pairs:"+count);
		
		
 	}
}