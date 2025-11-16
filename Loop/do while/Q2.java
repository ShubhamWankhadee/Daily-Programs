//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
public class Q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int n =1;
		do{
			System.out.print(no+" ");
			no--;
		}
		while(n<=no);
	}
}