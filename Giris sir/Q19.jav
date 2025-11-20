/*
19. Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.

*/

import java.util.*;

class GCDCalculator{
 
	public void findGCD(int a,int b){  
		int store =0;
		for(int i=1;i<=a;i++){
			if(a%1==0 && b%i ==0){
				store =1;
			}
		}
		System.out.println("Grestest common factor is :"+store);
		
	}
}
public class Q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the two nos: ");
		int a = sc.nextInt();
		int b=sc.nextInt();
		
		 
	 
		GCDCalculator obj = new GCDCalculator();
		obj.findGCD(a,b);
	}
}