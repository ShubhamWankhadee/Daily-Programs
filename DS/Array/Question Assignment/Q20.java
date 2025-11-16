/*
Q5. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]

Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1
The program should first sort the array in ascending order, then print the reverse of that order for descending.


*/

import java.util.*;
public class Q20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		System.out.println("Enter the Value of Array:");
		int arr[] = new int[size];
	    
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();	
		}
		System.out.println("Print Orijinal Array");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);	
		}
		 
		 // ---------------------------------------- 2 5 4 18 
		  
 
		// Assending order array
		 for (int i=0; i<arr.length; i++) {
			 // i for the skip end already sorted
            for (int j=0; j<arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		System.out.println("\nAssending array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		 // Decending 
		for (int i=0; i<arr.length ; i++) {
			 // i for the skip end already sorted
            for (int j=0; j<arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		System.out.println("\nDeccending array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
 
		 
	}
}