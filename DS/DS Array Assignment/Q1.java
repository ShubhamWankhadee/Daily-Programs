/*
Question 1:
Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example:
 arr = [2, 4, 4, 4, 6, 7, 9], x = 4
 Output: First = 1, Last = 3
Explanation:
Modify binary search:


To find first occurrence, if arr[mid] == x, move left to check more occurrences.
To find last occurrence, if arr[mid] == x, move right to check more occurrences.


This requires two binary searches.

*/
 import java.util.*;
public class Q1{
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
		// enter the target value
		System.out.println("\nEnter the target value:");
		int x = sc.nextInt();
		//===================================================
		  int left=0,right=arr.length-1, mid ,first=0,last=0;
		 
		 while(left<=right){
			 
			 mid = left+(right -left)/2;
			 if(arr[mid] == x){
				 right = mid-1; 
				 	 
			 }else if(arr[mid]<x){
				 left = mid+1;
				  
 
			 }else {
				 right = mid-1; 
				 
			 }
		 }
		 
		 System.out.println(left);
		   left=0;right=arr.length-1;mid=0;
		 		while(left<=right){
			 
			 mid = left+(right -left)/2;
			 if(arr[mid] == x){
				 left = mid+1; 
				 	 
			 }else if(arr[mid]<x){
				 left = mid+1;
				  
 
			 }else {
				 right = mid-1; 
				 
			 }
		 }
		 
		 System.out.println(right);
	 
		 
			 
				
	 	 
	 
	}
}