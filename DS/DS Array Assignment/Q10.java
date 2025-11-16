/*
Q10. Problem:
 Reverse an integer array using a stack — no second array or built-in functions.
Example:
 Input: {10, 20, 30, 40}
 Output: {40, 30, 20, 10}
Logic Explanation:
Push all elements onto the stack.
Pop elements one by one and put them back into the array.
Stack’s LIFO order reverses the elements.

*/

import java.util.*;
public class Q10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter Values in Array:");
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int stack[] = new int[size];
		int top = -1;
		for(int i=0;i<arr.length;i++){
			
			top++; // push
			stack[top] = arr[i];
			
		}
		for(int i=0;i<arr.length;i++){
			 // pop
			arr[i] = stack[top];
			top--;
		}
		System.out.println("Reverse Stack Display:");
		for(int i=0;i<arr.length;i++){
			
			System.out.print(" "+arr[i]);
		}		
		
		
		
	}
	

}