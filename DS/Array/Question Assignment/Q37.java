/*
Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0

*/

import java.util.*;
public class Q37{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.print("\n Enter the value in Array:");
		for(int i =0;i<arr.length;i++){
			arr[i] =  sc.nextInt();
		}
		System.out.print("\n  original array print:");
		for(int i =0;i<arr.length;i++){
			 System.out.print(" "+arr[i]);
		}
		int temp=0;
		for(int j=0;j<arr.length;j++){
			for(int i=1;i<arr.length-1-j;i++){
				 if(arr[i] == 0  ){
					  temp= arr[i];
					  arr[i] = arr[i+1];
					  arr[i+1] = temp;
				 } 
			}
		}
			System.out.print("\n  After perform op array print:");
			for(int i =0;i<arr.length;i++){
				 System.out.print(" "+arr[i]);
			}
		
	}
}