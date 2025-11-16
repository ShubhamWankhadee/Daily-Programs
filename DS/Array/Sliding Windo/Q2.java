/*
2. Minimum Sum Subarray of Size K
Example:
Input: arr = [2, 1, 5, 1, 3, 2], K=3
Output: 4 (subarray [1, 3, 2])

*/

import java.util.*;
public class Q2{
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
		   int less;
		   for(int i=0;i<k;i++)
		   { sum = sum + arr[i];
		   }
		   less=sum;
		   for(int i=k;i<arr.length;i++)
		   {
				 sum = sum + arr[i]-arr[i-k];
				 if(sum<less)
				 { less=sum;
				 } 
		   }
		   System.out.printf("Sum of max sub array is  "+less);
	   }

}