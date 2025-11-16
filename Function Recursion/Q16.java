 // Q16. Write a java program to find power of a number.

import java.util.*;
public class Q16{
	int n=1;
	public int  Power(int base,int index){
		
		if(index != 0){
			n =n*base;
			index --;
			return Power(base,index);//5 2 25 1 
		} 
		return n;
		
	}
	
    public static void main(String x[])
	{  Scanner sc  = new Scanner(System.in);
		Q16 obj = new Q16();
	   
	   System.out.println("Enter the Base and Index: ");
	  int  base = sc.nextInt();
	   int index = sc.nextInt();
	   
	   int result = obj.Power(base,index);
	   System.out.println("The power of no is: "+result);
	    
	}
}

