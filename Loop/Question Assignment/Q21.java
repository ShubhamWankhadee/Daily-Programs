/*
	Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself 
and 1 without remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7,
 11, 13, 17, 19,
 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
*/
import java.util.*;

public class Q21
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		 
		boolean  flag =false;
		for(int i=2;i< no;i++){
			if(no%i==0){
				 
				 flag  = true;
				 
				break;
			}
		}
		if(flag == true){
			System.out.println("No is Not prime");
					
		}else{
				System.out.println("No is prime");
		}
		 
		
	}
}