/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.

*/

import java.util.*;
public class Q23{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		boolean flag = false;
		do{
			int rem = no%10;
			if(rem == 0){
				flag = true;
			}
			no = no/10;
		}while(no>0);
		if(flag){
			
			System.out.println("No is Duck");
			
		} else{
			
			System.out.println("No is not Duck");
		}
	}
}