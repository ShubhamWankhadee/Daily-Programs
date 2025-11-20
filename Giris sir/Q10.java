/*
10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.


*/


class CircleArea{
	public double findArea(int radius){
		 
		double area = 3.14*radius*radius;
		return area;
	}
	 
}
public class Q10{
	public static void main(String args[]){
		CircleArea obj = new CircleArea();
		 
		int radius=10;
		System.out.println("Celsius to Fahrenheit is: "+ obj.findArea(radius));
		 
		
	}
}