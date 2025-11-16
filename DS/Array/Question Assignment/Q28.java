/*
Q3. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]


Explanation:


10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.
*/

import java.util.*;
public class Q28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the values in Array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original Array print:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5 == 0){
				arr[i] =5;
			}
		}
		System.out.println("\nAfter Replace By 5 : ");
		for(int i=0;i<arr.length;i++){
			
			System.out.print(" "+arr[i]);
		}
	}
}