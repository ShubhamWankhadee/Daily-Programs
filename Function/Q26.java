/*
Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.

*/

import java.util.*;
public class Q26{
	public static void Neon(int no){
		int sum =0;
		int rem=0;
		int sq = no*no;
		while( sq>0){
			  rem =sq%10;
			sum += rem;
			sq /=10;
		}
		if(sum == no){
			System.out.println("No is Neon!");
		}else{
			System.out.println("No is Not Neon!");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		Neon(no);
	}
}