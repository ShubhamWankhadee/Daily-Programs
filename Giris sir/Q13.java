/*
13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.


*/

import java.util.*;

class PowerCalculator{
	int store=1;
	public void reverse(int base ,int no){
		
		 
		if(no>0){
			store= store*base;
			no--;
			reverse(base,no);
		}else
			System.out.println("Power fo no is : "+ store);
	}
	 
}
public class Q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Base & Power: ");
		int base = sc.nextInt();
		int pow = sc.nextInt();
		PowerCalculator obj = new PowerCalculator();
		obj.reverse(base,pow);
		 
		 
		
	}
}