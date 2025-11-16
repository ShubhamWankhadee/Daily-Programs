/*
Q56. Write a Java program to display the following series:
7   10   15   22   31   42   55   70
(Start at 7, differences increasing by 1 each time: +3, +5, +7...)



*/
public class Q56{
	public static void main(String args[]){
		int b=7,a=3;
		for(int i=1;i<=8;i++){
			 
			 System.out.print(b+" ");
			   b=b+a;
			 a=a+2;
			 
		}
	}
}