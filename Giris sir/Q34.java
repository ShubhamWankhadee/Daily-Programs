/*

Q3. WAP to create class name as Factorial with two functions 
   void setNum(): this function can accept number as parameter 
   void showFactorial(): this function is used for calculate factorial of number and  display it


*/
import java.util.*;

class Factorial{

	public void showFactorial() {
    int fact = 1;
    int index = no;    

    while(index > 0) {
        fact = fact * index;   
        index--;  
    }

    System.out.println("Factorial of a no is: " + fact);
}
	 
}
public class Q34{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		 
		Factorial obj = new Factorial();
		obj.setNum(no);
		obj.showFactorial();
	
	}
}