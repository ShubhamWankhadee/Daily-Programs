// Q16. Write a java program to find power of a number.

import java.util.*;
public class Q16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base no:");
		int bs = sc.nextInt();
		System.out.println("Enter power no:");
		int po = sc.nextInt();
		int a=po-1;
		int sum =bs;
		do{
			sum = sum  * po;
			a--;
		}while(a>0);
		System.out.println(sum);
		
	}
}