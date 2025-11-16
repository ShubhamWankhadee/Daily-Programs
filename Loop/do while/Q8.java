// Q8. Write a java program to find the sum of all odd numbers between 1 to n.

import java.util.*;
public class Q8{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the no:");
		 int no = sc.nextInt();
		 int n=1;
		 int sum =0;
		do{
			if(n%2!=0){
				 sum = sum +n;
			}
			
			 n++;
		}
		while(n<=no);
		System.out.println(sum);
	}
}