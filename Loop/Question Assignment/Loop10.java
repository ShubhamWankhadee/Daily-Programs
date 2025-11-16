//Q10. Write a java program to count the number of digits in a number.

import java.util.*;

public class Loop10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		int i;
		for( i=0;no!=0;i++){
			no = no/10;
			 
			
		}System.out.println(i);
	}
}