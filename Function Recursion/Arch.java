/*
	Q5. Problem:
 Given an integer array, find the next greater element for each element using a stack.
 If no greater element exists, print -1 for that position.
Example:
 Input: {4, 5, 2, 25}
 Output: {5, 25, 25, -1}
Logic Explanation :
Traverse from right to left.
Use a stack to keep track of greater elements.
For each element:


Pop smaller elements from the stack.
If the stack is not empty, its top is the next greater element.
Push the current element to the stack.

*/

import java.util.*;
public class Q5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter Values in Array:");
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
	}
	

}