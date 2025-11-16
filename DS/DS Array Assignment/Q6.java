/*
Q6. Problem:
 Perform binary search to find the index of a given key in a sorted array.
 If the key is not found, print -1.
Example:
 Input:
 arr = {2, 4, 6, 8, 10, 12}
 key = 10
 Output: Index = 4
Logic Explanation:
Set low = 0, high = arr.length - 1.


Find mid = (low + high) / 2.
If arr[mid] == key, element found.
If arr[mid] < key, search right half.
Else, search left half.

*/

import java.util.*;
public class Q6{
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
		while(left<=right){
			int mid = left+(right-left)/2;
			
			if(arr[mid] == key){
				System.out.println("Index is: "+mid);
				break;
			}else if(arr[mid] > key){
				 right = mid-1;
			}else{
				 left = mid+1;
			}
		
		}
		
		
	}
	

}