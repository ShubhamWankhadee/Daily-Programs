/*
Q2. Create a class Adder that contains overloaded methods named sum() to calculate:
sum of two integers,
sum of three integers, and
sum of two double values.
Q3. Write a program with a class MaxFinder having overloaded max() methods that return the largest value among:
two integers,
three integers, and
two double values.

*/
import java.util.*;
class Adder{
	
	public void sum(int a,int b){
		int result = a+b;
		System.out.println("Sum of Two no :"+a+b);
	}
	public void sum(int a,int b,int c){
		 System.out.println("Sum of Three no :"+a+b+c);
	}
	public void sum(double a,double b){
		System.out.println("Sum of Two double data type no :"+a+b);
	}
}
 
public class Q2{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Adder obj = new Adder();
		System.out.println(" Enter A ,B and C values");
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		 
		 obj.sum(a,b);
		 obj.sum(a,b,c);
		 
		 obj.sum((double)a ,(double)b);
		 
	}
}