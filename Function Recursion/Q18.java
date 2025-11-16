/*
Q18. Write a java program to find the first and last digit of a number.
*/

import java.util.*;
public class Q18{
	 static boolean flag=true;
	 static int last=0;
	public static void Find(int no){
		
	    if(flag){
			last = no%10; 
			flag = false;
		} 
		if(no>=10){// first no
			no = no/10;
			 
		Find(no);		
		}else{
		
		int first=no; 
		System.out.println("First no :"+first+" last no:"+last);			
		}

	}
	
    public static void main(String args[])
	{ 
		Scanner sc  = new Scanner(System.in);
		 
	   System.out.println("Enter the No: ");
		int no = sc.nextInt();
		Find(no);
	    
	  
	    
	}
}
