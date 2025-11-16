/*
Q3. Write a program with a class MaxFinder having overloaded max() methods that return the largest value among:
two integers,
three integers, and
two double values.

*/
import java.util.*;
class MaxFinder{
	public void Max(int a,int b){
		if(a>b)
			System.out.println("A is Greater !");
		else
			System.out.println("B is Greater !");
			
	}
	public void Max(int a,int b,int c){
		if(a>b && a>c)
			System.out.println("A is Greater !");
		else if(b>c && b<a)
			System.out.println("B is Greater !");
		else
			System.out.println("C is Greater !");
	}
	public void Max(double a ,double b){
		if(a>b)
			System.out.println("A is Greater !");
		else
			System.out.println("B is Greater !");
			
	}
	
	
	
}
public class Q3{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of A ,B and C");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	 
		MaxFinder obj = new MaxFinder();
	 
		 
			obj.Max(a,b);
		 
		    obj.Max(a,b,c);
		 
		   obj.Max((double)a,(double)b);
		  
	}
}
