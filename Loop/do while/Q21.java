/*
Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.

*/

import java.util.*;
public class Q21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int temp = no;
		int count=0;
		int n=1;
		while(no>=n){
			if(no%n==0){
				count++;
				 n++;
				 
			}else	 
			n++;
		}			
		  System.out.println( count);

		if( count == 2){
			System.out.println("No is Prime");
		}else{
			System.out.println("No is Not Prime");
		}
	}
}