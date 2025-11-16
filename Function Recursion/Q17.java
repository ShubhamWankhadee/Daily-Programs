// Q17. Write a java program to find all factors of a number.

import java.util.*;
public class Q17{
	 
	public static void Power(int no, int n){
		
		 n++;
		 if(no % n ==0 && n <= no/2){
			System.out.println(" "+n);
			Power(no,n);
		}
		 
		
	}
	
    public static void main(String x[])
	{  Scanner sc  = new Scanner(System.in);
		 
	   System.out.println("Enter the No: ");
		int no = sc.nextInt();
		System.out.println("Factor of no is: ");
		int n=0;
		Power(no ,n);
	    
	  
	    
	}
}
