/*
Q58. Write a Java program to display the following series:
2 6 12 20 30 42 56 72 90 110
(n(n+1) pattern multiplied by 2)*Q58

*/

public class Q58{
	public static void main(String args[]){
		int no=2,a=4;
		for(int i=1;i<=10;i++){
			 
			System.out.print(no+" ");
			no=no+a;
			a=a+2;
			
		}
	}
}