// Q10. Write a java program to count the number of digits in a number.
import java.util.*;
public class Q10{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the digit:");
		 int no = sc.nextInt();
		 int count= 0;
		do{
			count++;
			 no= no/10; 
			  
		}
		while(no>0);
		System.out.println(count);
		 
	}
}