/*
11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
reate a class CircleArea with a method findArea that calculates the area given the radius.


*/

import java.util.*;
class NumberReverser{
	public int  reverse(int no){
		int rem=0;
		while(no>0){
			int dig = no%10;
			rem =rem*10+dig;
			no /=10;
		}
		return rem;
	}
	 
}
public class Q11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no:");
		int no = sc.nextInt();
		NumberReverser obj = new NumberReverser();
		 
		System.out.println("Celsius to Fahrenheit is: "+ obj.reverse(no));
		 
		
	}
}