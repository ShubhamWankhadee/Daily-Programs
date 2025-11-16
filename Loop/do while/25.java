/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.

*/

import java.util.*;
public class Q25{
	public static void main(String argss[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int temp =no;
		int ori =no;
		int count =0;
		int sum =0;
		int add = 0;
		do{
		
			no = no/10;
			count++;
		}while(no>0);
		int check = count;
		
		while(temp>0){
			int rem = temp%10;
				sum = rem;
				while(check>0){
					sum = sum*check;
					check--;
				}
				add = add+sum;
			temp = temp/10;
			
		}
		if(ori == add){
			System.out.println("No is Strong");
		}else{
			System.out.println("No is not Strong");
		}
		
		
		
	}
}