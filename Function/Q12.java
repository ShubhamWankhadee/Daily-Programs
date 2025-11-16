// Q12. Write a java program to calculate the product of digits in a number.

import java.util.*;
public class Q12{
	 
	public static void count(int no){
		int prodDig =1;
		 while(no>0){
			int n =no%10;
			prodDig *=n;
		 no = no/10;
 		 }
		 System.out.println("Product of digits is: "+prodDig);
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		count(no);
	
	}
}