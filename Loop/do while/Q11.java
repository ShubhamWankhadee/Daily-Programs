//Q11. Write a java program to calculate the sum of digits in a number.
import java.util.*;
public class Q11{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the digit:");
		 int no = sc.nextInt();
		 int count= 0;
		 int sum =0 ;
		do{
			int rem =  no%10;
			sum = sum +rem;
			 no= no/10; 
			  
		}
		while(no>0);
		System.out.println(sum);
		 
	}
}