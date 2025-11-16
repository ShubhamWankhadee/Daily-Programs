
import java.util.*;

public class Q2
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the no:");
		 
		 int no = sc.nextInt();
		 int sum = 0;
		 sum= sum + no%10;
		 
		 no = no/10;
		  sum= sum + no%10;
		  
		   no = no/10;
		  sum= sum + no%10;
		  System.out.println("sum is: "+sum);
	}
}