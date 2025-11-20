/*
15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.


*/

import java.util.*;

class Swapper{
 
	public void swap(int a,int b){  
		
		a = a+b;  
		b = a-b; 
		a = a-b; 
		
		System.out.println("A is :"+a);

		System.out.println("B is :"+b);
			 
	}
	 
}
public class Q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the two No: ");
		int a = sc.nextInt();
		int b= sc.nextInt();
	 
		Swapper obj = new Swapper();
		obj.swap(a,b);
		 
		 
		
	}
}