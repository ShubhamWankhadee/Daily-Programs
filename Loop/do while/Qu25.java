/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.

*/

import java.util.*;
public class Qu25{
	public static void main(String argss[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int temp =no;
		int ori =no;
		int sum=0;
		int store=0;
		int count=0;
		int save=0;
		
		// for count digit
		do{
		
			no = no/10;
			count++;
		 
		}while(no>0);
		
		while(temp>0){
			int rem = temp%10;
			int print= count;
		
			save=rem;
			
				while(print>1){
					save= save*rem;
					print--;
				}
				
				store=store+save;
			
			temp = temp/10;
			
		}
		  
		if(ori == store){
			System.out.println("No is Strong");
		}else{
			System.out.println("No is not Strong");
		}
		 
		
		
	}
}