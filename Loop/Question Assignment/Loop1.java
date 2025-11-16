//Q1. Write a java program to print all natural numbers from 1 to n. using while loop

import java.util.*;
public class Loop1{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		
		int no = sc.nextInt();
		for(int i=1;i<=no;i++){
			System.out.println(i);
		}
	}
}
