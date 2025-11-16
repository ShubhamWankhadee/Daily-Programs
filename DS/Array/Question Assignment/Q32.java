/*
Q7. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication,
 and update the array element with this value.

*/

import java.util.*;
public class Q32{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int arr1[] = new int[size];
		System.out.println("Enter the values in Array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int sum =0,k;
		for(int i =0;i<arr.length;i++){
			k =arr[i]-1;
			sum = arr[i];
			while(k>0){
				sum =  (sum*k);
				k--;
			}
			arr1[i] = sum;
		}
		System.out.println("\n Factorial print array:");
		for(int i =0;i<arr.length;i++){
			System.out.print(" "+ arr1[i]);
		}
	}
}