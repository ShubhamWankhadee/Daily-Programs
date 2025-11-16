// Q17. Write a java program to find all factors of a number.


import java.util.*;
public class Q17{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int n=1;
		do{
			if(no%n== 0){
				System.out.println(n);
				 
			}
			n++;
		}while(n<=no);
		
	}
}