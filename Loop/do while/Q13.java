//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;
public class Q13{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the digit:");
		 int no = sc.nextInt();
		  
		 int sum =0;
		do{
			int rem =  no%10;
			sum = (sum *10 )+rem;
			 no= no/10; 
			  
		}
		while(no>0);
		System.out.println(sum);
		 
	}
}