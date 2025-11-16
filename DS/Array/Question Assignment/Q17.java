/*
	Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array

*/
import java.util.*;
public class Q17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr[] = new int[8];
		System.out.println("Enter the value in array:");
		for(int i =0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		// half of array length
		int appears = size/2;
		// to count how many time appears
		int majority=0,scount=0;
		for(int i =0;i<arr.length;i++){
			int count=0;
			for(int j =0;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			scount =count;
			if(appears <= count){
				majority = arr[i] ;
			}
		}
		if(scount >= appears){
			System.out.print("A mojority element in array"+majority);
		}else{
			System.out.print("There are no Majority Elements in the given array");

		}
		
		
	}
}