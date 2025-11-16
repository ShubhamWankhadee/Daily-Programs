import java.util.*;

public class Q9
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the no:");
		 
		 int no = sc.nextInt();
		  
		  
		  if((no % no == 0) && (no %1==0))
		  {
			System.out.println("Number is Perfect");
		  }else
		  {
			System.out.println("Number is not Perfect");
		  }
	}
}