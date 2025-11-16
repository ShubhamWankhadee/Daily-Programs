
/*
	1	2	3	4	5
	6			7
	8		9
	10	11
	12


*/

public class Q54
{
	public static void main(String args[])
	{
		int a=1;
		for(int i= 1;i<=5;i++)
		{
			
			for(int j =1;j<=5;j++)
			{
				if(i == 1 || j==1 || i+j ==6 )
				{
					System.out.print(a+" ");
					a++;
					
				}else
				{
					System.out.print("  ");
					
				}
			}
			
			System.out.println();
		}
	}
}