/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,


*/
import java.util.*;

public class Question24
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		int ori =no;
		int sum = 0;
		int store =0;
		 
		while(no>0){
			int rem = no%10;
			  sum =rem ;
			  rem = rem-1;
			  while(rem>=1){
				  sum =  sum *rem;
				  rem--;
			  }
		  store = store +sum;
			 
			no = no/10;
			 
		}
		 System.out.println("sum is:"+store);
		if(ori == store){
			
			System.out.println("No is Strong");
		}else{
			System.out.println("No is not Strong");
		}
		 
		
	}
}