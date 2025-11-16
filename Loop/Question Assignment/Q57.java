/*
Q57. Write a Java program to display the following series:
     1 1 2 3 5 8 13 21 34
(Fibonacci series using loop — first 9 terms)

*/

public class Q57{
	public static void main(String args[]){
		int no=0,a=0,b=1;
		for(int i=1;i<=9;i++){
			  no=a+b;
				a=b;
				b=no;
			System.out.print(a+" ");
			
		}
	}
}