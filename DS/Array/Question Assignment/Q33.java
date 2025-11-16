/*
Q8. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime 
(only divisible by 1 and itself), and count such elements.
*/

import java.util.*;
public class Q33{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		 
		System.out.println("Enter the values in Array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		 int count1=0;
		for(int i =0;i<arr.length;i++){
			 int no=2,count=0;
			 while(arr[i] >= no){
				 
				 if(arr[i]%no==0){
					 count++;
					 
				 }
				 
				 no++;
			 }
			 if(count == 1){
				  count1++;
			 }
		}
		System.out.print("Count of prime no:"+count1);
		 
	}
}