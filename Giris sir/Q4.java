/*
4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.

*/


class NumberChecker{
	public void compare(int no){
		if(no%2 ==0){
			System.out.println("No is Even!");
		}else{
			System.out.println("No is Odd!");
		} 
		 
	}
	 
}
public class Q4{
	public static void main(String args[]){
		NumberChecker obj = new NumberChecker();
		 
		int b=10;
		obj.compare(b);
		 
		
	}
}