/*
20. Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula.

*/

import java.util.*;

class NaturalNumberSum{
 
	public void calculateSum(int no){  
		int sum =0;
		for(int i=1;i<=no;i++){
			sum += i; 
		}
		System.out.println("The sum of Nth Natural no is :"+sum);
		
	}
}
public class Q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the nos: ");
		int no = sc.nextInt();
		
		NaturalNumberSum obj = new NaturalNumberSum();
		obj.calculateSum(no);
	}
}