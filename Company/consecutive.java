/*
   Q1. Write a Java program to find the length of the longest consecutive elements
sequence from an unsorted array of integers. The longest consecutive elements 
sequence is [1, 2, 3, 4,5], Sample array: [49, 1, 3, 200, 2, 4, 70, 5]

therefore the program will return its length 5.
*/
import java.util.*;
public class consecutive{
	public static void main(String args[]){
		
		int arr[] ={49, 1, 3, 200, 2, 4, 70, 5};
		Arrays.sort(arr);
		int length=1;
		int count=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i] == arr[i-1]+1){
				count++;
			}else if(arr[i] != arr[i-1]){
				count=1;
			}
			if(count>length){
				length = count;
			}
		}
		System.out.println("longest consecutive length is : "+length);
			
	}
}