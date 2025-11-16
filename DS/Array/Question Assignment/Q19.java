/*
Q4. Write a program in java to find the smallest missing element from a sorted array?
		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/


import java.util.*;
public class Q19
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
		 
		// to find missing element
		System.out.println("\nAfter perform operation:");
		int k=0,count=0;//k for the 0 1 2 3 and count is count
		for(int i =0;i<arr.length;i++)
		{
			 
			if(arr[i] != k){
				 
				 System.out.println("\nSmallest no :"+k);
				k = arr[i];
				count++;
				break;
			}
		 k++;	
		}
		 
	}
}