
/*

	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I

*/

public class Q62
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
			 
			}
			    b++;
			System.out.println();
			
		}*/
		for(int i=65;i<=69;i++)
		{
			int c= i;
			for(int j =1;j<=5;j++){
				
				System.out.print((char)c);
				c++;
			}
			System.out.println();
		}
	}
	
}