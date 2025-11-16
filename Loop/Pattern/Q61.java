
/*

A	B	C	D	E
A	B	C	D	E
A	B	C	D	E	
A	B	C	D	E
A	B	C	D	E

*/

public class Q61
{
	public static void main(String args[])
	{
		/*
		 
		for(int i= 1;i<=5;i++)
		{
			 
			 char a = 'A';
			 int b= (int)a;
			for(int j =1;j<=5;j++)
			{
				char c= (char)b;
			 
				System.out.print(c);
				b++;
			}
			 
			System.out.println();
		}
		*/
		for(int i= 65;i<=69;i++)
		{
			 
			char a =(char)i;
			for(int j =1;j<=5;j++)
			{
			 
				System.out.print(a);
				a++;
				 
			}
			 
			System.out.println();
		}
	}
	
}