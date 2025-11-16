/*
Q7. Problem :
 In a sorted array, use binary search to find the position where a given key should be inserted to maintain order.
Example:
 Input:
 arr = {1, 3, 5, 6}, key = 2
 Output: Insert Position = 1
Logic Explanation:
Use binary search to find mid.
If key < arr[mid], move high to mid - 1.
If key > arr[mid], move low to mid + 1.
When loop ends, low will be the correct insert position.
*/

import java.util.*;
public class Q7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter Values in Array:");
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Key: ");
		int key = sc.nextInt();
		
		int left=0,right= size-1;
		int pos=0;
		
		while(left<=right){
			int mid = left+(right-left)/2;
			
			if(arr[mid] == key){
				System.out.println("Index is: "+ mid+1);
				break;
			}else if(arr[mid] > key){
				 right = mid-1;
			}else{
				 left = mid+1;
			}
		
		}
		
		
	}
	

}