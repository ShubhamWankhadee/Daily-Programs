/*
Question 3:
Given an integer n, find its floor square root using binary search.
Example:
 n = 17
 Output: 4 (since 4² = 16 ≤ 17 < 25)
Explanation:
Apply binary search between 1 and n.
If mid * mid == n, answer found.
If mid * mid < n, move right, but store mid as possible answer.
If mid * mid > n, move left.

*/

import java.util.*;
public class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter the values in array:");
		for(int i=0;i<arr.length;i++){
		  arr[i] = sc.nextInt();
		}
		System.out.println("Original Array print:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nEnter the target value:");
		int x = sc.nextInt();
		 int left =0,right= arr.length,mid,result;
		 while(left<right){
			 mid = left+(right-left);
			 
			 if(mid * mid <= x){
				 result = mid;
				 break;
			 }else if(mid* mid < x){
				 left = mid+1;
				 
			 }else{
				 right = mid-1;
			 }
			 
		 }
		 System.out.print("no is: "+right);
	}
}