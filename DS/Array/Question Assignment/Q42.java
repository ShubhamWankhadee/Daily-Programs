/*

Q8. Write a java program to display top three value from array.

	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86

*/


import java.util.*;
public class Q42{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter the values in array:");
		for(int i=0;i<arr.length;i++){
		  arr[i] = sc.nextInt();
		}
		System.out.println("Original Array print:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		int max=arr[0],max1=arr[0],max2=arr[0];
		for(int i=0;i<arr.length;i++){
			 
	 
				if(arr[i] > max){
					max2 =max1;
					max1 = max;
					max =arr[i];
				}else if(arr[i]> max1 && arr[i] != max){
					max2 = max1;
					max1 =arr[i];
					
				}else if(arr[i] > max2 && arr[i] != max1 && arr[i] != max){
					max2 =  arr[i];
				} 
		 
		}
		     
		
 

		System.out.println("\nfirst max: "+max+"\nsecoutn max: "+max1+"\nthird max: "+max2);
		
	}
}
