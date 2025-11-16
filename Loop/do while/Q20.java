// Q20. Write a java program to swap first and last digits of a number.

import java.util.*;
public class Q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int temp= no;
		int last = no%10;
		int first =  no/100;
		
		no = no/10; 
		no = no%10;
		int mid = no*10;
		last = last *100;
		int sum = last + mid+ first;
		System.out.println(sum);
	}
}

while(no>0){
	no = no/10;
	count++;
}

while(count -1){
	int sq=sq+ (10*10);
	count--;
	
}
 first = temp/sq;
 last = temp%10; 2568
 mid = (temp % sq)/10;
 
 
 
 
 


   
	 