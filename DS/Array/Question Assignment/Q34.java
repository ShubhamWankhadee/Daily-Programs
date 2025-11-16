/*
Q9. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of
 its proper divisors (excluding itself). For each element, 
 find sum of divisors and compare with the number, then count.
*/

import java.util.*;
public class Q34{
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
		 int count=0;
		 for(int i=0;i<arr.length;i++){
			 int no = 1,sum =0;
			 while(arr[i]/2 >= no){
				 
				 if(arr[i]%no == 0){
					 sum = sum+ no;
				 }
				no++;
			 }
			 if(arr[i] == sum){
				count++;  
			 }	 
		 }
		 System.out.println(" Count of Perfect number is:"+count);
		 
	}
}