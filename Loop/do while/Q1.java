// Q1. Write a java program to print all natural numbers from 1 to n. using while loop

import java.util.*;
public class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int n =1;
		do{
			System.out.print(n+" ");
			n++;
		}
		while(n<=no);
	}
}