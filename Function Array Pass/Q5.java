/*
Q5. Write a Java program that finds the sum of even and odd elements in an array using functions.
Example Input:
arr = {10, 15, 8, 7, 9, 12}
Output:
Sum of Even: 30  
Sum of Odd: 31


*/


import java.util.*;
public class Q5{
	static int Even	=0;
	static int Odd=0;
		
	public static void E_O_Sum(int arr[],int i){
			if(i <arr.length){ 
				if(arr[i]%2==0){
					Even += arr[i];
					
				}else{
					Odd += arr[i];
				}
				if(i == arr.length-1){
					System.out.println("Sum of Even no is: "+Even);
					System.out.println("Sum of Odd no is: "+Odd);
				}
				E_O_Sum(arr,i+1); // Recursion
			}		
	}
	public static void main(String args[]){
		int arr[] = {10, 15, 8, 7, 9, 12};
		  int i= 0;
		E_O_Sum(arr,i);
	 
	}
}