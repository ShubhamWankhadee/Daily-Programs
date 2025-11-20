/*
12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.


*/

import java.util.*;
class NumberReverser{
	int fact=1;
	public void  reverse(int no){
		 
		if(no>0){
			fact = fact*no;
				no--;
				reverse(no);
		}else
			System.out.println("Factorial is: "+fact );	 
		
	}
	 
}
public class Q12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no:");
		int no = sc.nextInt();
		NumberReverser obj = new NumberReverser();
		 obj.reverse(no);
		 
		 
		
	}
}