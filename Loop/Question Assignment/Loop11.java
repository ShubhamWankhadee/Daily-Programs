//Q11. Write a java program to calculate the sum of digits in a number.

import java.util.*;

public class Loop11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		
		int sum =0;
		 
		
		for(int i =0 ;no !=0;i++){
			 sum = sum +(no%10);
			no =no/10;
			
		}
		System.out.println(sum);
	}
}