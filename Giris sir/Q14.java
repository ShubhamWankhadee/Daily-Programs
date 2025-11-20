/*
14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.


*/

import java.util.*;

class PrimeChecker{
 
	public void isPrime(int no,int start){
		if(no%start ==0 && start >1){
			System.out.println("No is Not prime!");
		}else if(start == 2){
			System.out.println("No is prime!");
		}else{
			isPrime(no,--start);
		}
		 
			 
	}
	 
}
public class Q14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the No: ");
		int no = sc.nextInt();
		int start =no-1;
	 
		PrimeChecker obj = new PrimeChecker();
		obj.isPrime(no,start);
		 
		 
		
	}
}