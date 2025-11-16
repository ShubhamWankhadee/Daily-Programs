/*
Q1. Write a Java program to create a class AreaCalculator that uses function overloading to calculate the area of:
a circle using radius,
a rectangle using length and breadth, and
a triangle using base and height.
Use methods:
void area(int r)
void area(int l, int b)
void area(double b, double h)



*/
import java.util.*;
class AreaCalculator{
	public void area(int r){
		System.out.println(" Area of Circle :"+3.14*r*r);
	
	}
	public void area(int l,int b){
		System.out.println(" Area of Rectangle :"+l*b);
	}
	public void area(double b,double h){
		System.out.println(" Area of Triangle :"+b*h*0.5);
		
	}
	
	 


}
public class Q1{

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		AreaCalculator obj = new AreaCalculator();
		int radius,length,breadth,height;
		
		System.out.println("Enter the radius: ");
		radius = sc.nextInt();
		
		System.out.println("Enter the length: ");
		length = sc.nextInt();

		System.out.println("Enter the breadth: ");
		breadth = sc.nextInt();

		System.out.println("Enter the height: ");
		height = sc.nextInt();
		obj.area(radius);
		obj.area(length , breadth);
		obj.area((double)breadth , (double)height);
		
 	
	}
}