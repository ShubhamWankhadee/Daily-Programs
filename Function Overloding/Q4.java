/*
Q4. Write a Java class VolumeCalculator with overloaded methods named volume() to calculate:
volume of a cube (using side),
volume of a cuboid (using length, breadth, height),
volume of a cylinder (using radius, height).
Hint: Apply formulas :
Cube → side³
Cuboid → l×b×h
Cylinder → 3.14×r×r×h

// Volume of a Cube
double volumeCube = side * side * side;

// Volume of a Cuboid
double volumeCuboid = length * breadth * height;

// Volume of a Cylinder
double volumeCylinder = Math.PI * radius * radius * height;

*/

import java.util.*;
class VolumeCalculator{
	int result=0;
	public void volume(int side){
		 
		double volumeCube = side * side * side;
		System.out.println("Volume of a Cube :"+result);
	}
	public void volume(int length ,int breadth,int height){
		
		double volumeCuboid = length * breadth * height;
		 System.out.println("volume of a cuboid :"+volumeCuboid);
	}
	public void volume(int radius,int height){
		double volumeCylinder = 3.14 * radius * radius * height;
		System.out.println("Sum of Two double data type no :"+volumeCylinder);
	}
}
public class Q4{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of side ,length ,breadth ,height and radius");
		int side = sc.nextInt();
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int height = sc.nextInt();
		int radius = sc.nextInt();
		VolumeCalculator obj = new VolumeCalculator();
	 
		 
			obj.volume(side);
		 
		    obj.volume(length,breadth,height);
		 
		   obj.volume(radius,height);
		  
	}
}