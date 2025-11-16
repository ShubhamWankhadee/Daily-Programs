
/*

	A	A	A	A	A
	B	B	B	B	B
	C	C	C	C	C
	D	D	D	D	D
	E	E	E	E	E

*/

public class Q60
{
	public static void main(String args[])
	{
		
		 char a = 'A';
		 int b= (int)a;
		for(int i= 1;i<=5;i++)
		{
			 
			
			for(int j =1;j<=5;j++)
			{
				char c= (char)b;
			 
				System.out.print(c);
			}
			b++;
			System.out.println();
		}
	}
	
}