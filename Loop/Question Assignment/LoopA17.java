/*
Q17. Write a java program to find all factors of a number.
*/
import java.util.*;
public class LoopA17{
	public static void main(String args[]){
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		for(int i =1;i<=no;i++){
			
			if(no %i == 0){
				System.out.print(i+", ");
			}
		}
		int a=5,b=10;
		System.out.print(a+b"Shubham"+a+b);
	}
}
