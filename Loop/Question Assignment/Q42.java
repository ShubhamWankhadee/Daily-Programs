/*
Q42. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45   

*/

import java.util.*;
public class Q42{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no= sc.nextInt();
		int sq = no*no;
		int sq1=sq;
		int sum =0;
		int rem1;
		int count=0;
		while(sq>0){
			int rem = sq%10;
			count++;
			
			sq = sq/10;
		} 
		if(count == 2){
			while(sq1>0){
				  rem1 = sq1%10;
					sum = sum+rem1;
				sq1 = sq1/10;
			}
		}else if(count ==4){
			while(sq1>0){
				 rem1 = sq1%100;
					sum = sum+rem1;
					System.out.println("rem: "+rem1);
				sq1 = sq1/100;
			}
			  
		}
		String check = (no == sum) ? "No is Kaprekar" :"No is no Kaprekar" ;
		 
		System.out.println(check);
	}
}