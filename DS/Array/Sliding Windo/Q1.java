/*
1. Maximum Sum Subarray of Size K
Example:
Input: arr = [2, 1, 5, 1, 3, 2], K=3
Output: 9 (subarray [5, 1, 3])

*/

import java.util.*;
public class Q1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter the values in Arrays:");
			int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		   int k=3;
		   int sum=0;
		   int max;
		   for(int i=0;i<k;i++)
		   { sum = sum + arr[i];
		   }
		   max=sum;
		   for(int i=k;i<arr.length;i++)
		   {
				 sum = sum + arr[i]-arr[i-k];
				 if(sum>max)
				 { max=sum;
				 } 
		   }
		   System.out.printf("Sum of max sub array is  "+max);
	   }

}