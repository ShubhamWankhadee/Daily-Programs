/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,

*/

import java.util.*;
public class Q24{
	public static void main(String argss[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int temp =no;
		int sum = 0;
		int add =0;
		do{
			int rem = no%10;
			int r1 = rem-1;
			sum = rem;
			
				while(r1 >=1){
					sum = sum*r1;
					r1--;
				}
				  add = add+sum;
			no = no/10;
		}while(no>0);
		System.out.println(add);
		if(temp == add){
			System.out.println("No is Strong");
		}else{
			System.out.println("No is not Strong");
		}
		
	}
}