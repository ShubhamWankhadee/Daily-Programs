// Q12. Write a java program to calculate the product of digits in a number.

import java.util.*;

public class Loop12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		
		int product = 1;
		for(int i =0;no !=0;i++){
			product = product*(no%10);
			no=no/10;
		}
		System.out.println(product);
	}
}