/*
Q45. Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
Explanation:
 Use a loop to check for each number from 1 to n. 
 For each, use another loop to find if it can be expressed as x*(x+1).
 If x = 1 → 1 * (1+1) = 2

If x = 2 → 2 * (2+1) = 6

If x = 3 → 3 * (3+1) = 12

If x = 4 → 4 * (4+1) = 20
*/


import java.util.*;
public class Q45{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		
		for(int i=1;i<=no;i++){
			int x = i*(i+1);
			System.out.println("no"+i);
			System.out.println(""+x);
			 
			
			if(no<x){
				break;
			}
			
		}
		 
		
	}
}