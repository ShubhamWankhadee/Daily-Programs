// Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class Q14{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int  no = sc.nextInt();
		int temp = no;
		int sum = 0;
		do{
			int rem = no%10;
			  sum = (sum*10)+rem;
			no = no/10;
			
		}
		while(no>0);
		if(temp == sum){
			System.out.println("No is palindrome");
			
		}else{
			System.out.println("No is not palindrome");
		}
	}
}