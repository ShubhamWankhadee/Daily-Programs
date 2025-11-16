// Q10. Write a java program to count the number of digits in a number.

import java.util.*;
public class Q10{
	 
	public static void count(int no){
		int countdig =0;
		 while(no>0){
			no = no/10;
			countdig++;
		 
 		 }
		 System.out.println("In number digits is: "+countdig);
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		count(no);
	
	}
}