/*
Q8. Write a Java function that returns the average value of all elements in an array.

*/


import java.util.*;
public class Q8{
	static int sum = 0;
	static int avg =0;
	public static int Avg(int arr[],int i){
			if(i <arr.length){ 
				sum += arr[i];
				avg = sum/arr.length-1;
				Avg(arr,i+1); // Recursion
			}
				
			return avg;
	}
	public static void main(String args[]){
		int arr[] = {10, 15, 8, 7, 9, 12};
		  int i= 0;
		int avg =Avg(arr,i);
		System.out.println("Average Value Elemen is :"+avg);
	 
	}
}