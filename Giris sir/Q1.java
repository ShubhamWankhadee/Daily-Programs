/*
1. Create a Class and Print a Message
Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called.
Explanation: Helps understand class and method creation.

*/
class HelloWorld{
	public void printMessage(){
		System.out.println("Hello, World!");
	}
}
public class Q1{
	
	public static void main(String args[]){
		HelloWorld obj = new HelloWorld();
		obj.printMessage();
	}
}
