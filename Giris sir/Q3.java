/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.

*/


class NumberComparison{
	public void compare(int a,int b){
		if(a ==b){
			System.out.println("No is Equal!");
		}else if(a>b){
			System.out.println("A is Greater than B!");
		}else{
			System.out.println("B is Greater than A!");
		}
		 
	}
	 
}
public class Q3{
	public static void main(String args[]){
		NumberComparison obj = new NumberComparison();
		int a=5;
		int b=10;
		obj.compare(a,b);
		 
		
	}
}