/*
Q1. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output:
 Element 30 found at index 2
Explanation:
 We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/


import java.util.*;
public class Q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in Array:");
		
		int a[] = new int[5];
		int check=-1;
		//take  in put values in array
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		 
		 System.out.println("Enter the element to want find it:");
		 int skey = sc.nextInt();
		for(int i=0;i<a.length;i++){
			if(skey == a[i]){
				check = i;
			}
		}
		if(check != -1){
			System.out.println("Elemnet "+ skey +" is found at index "+check);
		}else{
			System.out.println("Element is not found");
		}
		 
		
		
		
	}
}