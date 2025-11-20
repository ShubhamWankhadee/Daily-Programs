/*
2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers.
 Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.

*/

class Calculator{
	public void add(int a,int b){
		System.out.println("Addition of two no is: "+ (a+b));
	}
	public void sub(int a ,int b){
		System.out.println("Substraction of two no is: "+ (a+b));
	}
	public void mul(int a, int b){
		System.out.println("Multiplication of two no is: "+ a*b);
		
	}
	public void div(int a , int b){
		System.out.println("Division of two no is: "+ a/b);
	}
}
public class Q2{
	public static void main(String args[]){
		Calculator obj = new Calculator();
		int a=5;
		int b=10;
		obj.add(a,b);
		obj.sub(a,b);
		obj.mul(a,b);
		obj.div(a,b);
		
	}
}