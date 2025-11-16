/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.

*/
import java.util.*;

public class Q25
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		int ori =no;
		int temp =no;
		int count =0;
		int sum=0;
		int store= 0;
		
		while(no>0){
			int rem = no%10;
			count++;
			no = no/10;
		}
		 System.out.println(count);
		 
		 while(temp>0){
			 int rem1 = temp%10;
			 int a =count;
			 sum = rem1;
				while(a>0){
					sum = sum*rem1;
					store = store + sum;
					a--;
						 System.out.println(store);
				}
				  
			 temp = temp/10;
		 }
	 
	 
		/*
		if(ori == sum){
			
			System.out.println("No is Amstrong");
		}else{
			System.out.println("No is not Amstrong");
		}
			
			*/
		
	}
}