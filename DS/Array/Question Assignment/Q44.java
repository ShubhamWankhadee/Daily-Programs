/*

Q10. Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target. 
You may assume that each input would have exactly one solution, and you may not use the 
same element twice. 
You can return the answer in any order. 
Example 1: 
Input: nums = [2,7,11,15], target = 9   
Output: [0,1] 
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 
Example 2: 
Input: nums = [3,2,4], target = 6   
Output: [1,2]

*/
 


import java.util.*;
public class Q44{
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
		 System.out.println("\n Enter the target element:");
		 int target = sc.nextInt();
		 System.out.println("\nAfter perform op :");
		 
		for(int i=0;i<arr.length;i++){
			 
			 for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j]) == target){
					System.out.print(" "+i+ " "+j);
				}
			}
		    
		}
		
 
 
	}
}