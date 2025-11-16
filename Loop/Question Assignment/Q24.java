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
		
		while(no>0){
			int rem = no%10;
			int dec = rem;
			while(rem>=1){
				int strong = rem * dec;
				dec--;
			}
			no = no/10;
		}
		if(ori == strong){
			
			System.out.println("No is Strong");
		}else{
			System.out.println("No is not Strong");
		}
		 
		
	}
}