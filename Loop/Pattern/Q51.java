/*

Q1. Write a java program to print this pattern.

				1
			2	2
		3	3	3
	4	4	4	4
		3	3	3	
			2	2
				1

*/

public class Q51
{
	public static void main(String args[])
	{
		int a =3;
		for(int i= 1;i<=7;i++)
		{
			
			for(int j =1;j<=4;j++)
			{
				if(i<=4 && j>=5-i)
				{
					System.out.print(i);
					
					
				}else if( i>4 && j>=i-3)
				{
					System.out.print(8-i);
					 
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}