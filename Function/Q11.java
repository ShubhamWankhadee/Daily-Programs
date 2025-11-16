// Q11. Write a java program to calculate the sum of digits in a number.

import java.util.*;
public class Q11{
	 
	public static void count(int no){
		int sumdig =0;
		 while(no>0){
			int n =no%10;
			sumdig +=n;
		 no = no/10;
 		 }
		 System.out.println("Sum of digits is: "+sumdig);
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		count(no);
	
	}
}