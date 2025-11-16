//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
public class Loop2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		
		int no = sc.nextInt();
		for(int i=no;i>=1;i--){
			System.out.println(i);
		}
	}
}