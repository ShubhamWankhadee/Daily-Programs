/*
/*
	1	2	3	4	#
	1	2	3	#	5
	1	2	#	4	5
	1	#	3	4	5
	#	2	3	4	5

*/

public class Q52
{
	public static void main(String args[])
	{
		
		for(int i= 1;i<=5;i++)
		{
			
			for(int j =1;j<=5;j++)
			{
				if(6-i == j)
				{
					System.out.print("#");
					
				}else
				{
					System.out.print(j);
				}
			}
			
			System.out.println();
		}
	}
}