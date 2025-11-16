//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;

public class Loop9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		int store =0;
		for(int i =1;i<=10;i++){
			
				store = no*i;
			System.out.println(store);
		}
	}
}