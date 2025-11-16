// Q18. Write a java program to find the first and last digit of a number.

import java.util.*;
public class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no= sc.nextInt();
	 
		int last =  no%10;
		while(no >1){
			  no = no/10;
		}
			int first= no;
		System.out.println("First no is:"+first);
		System.out.println("Last no is:"+last);
	}
}