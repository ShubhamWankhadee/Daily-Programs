
public class patternLoop1
{
	public static void main(String args[])
	{
		int a=1;
		for(int i=1;i<=5;i++)
		{
				 
			for(int j=1; j<=5 ;j++)
			{
				 
				if(j>=4-i && j<=2+i && i<=3)
				{
					 
						System.out.print(a);
					 
				}
				else if(i>3 && j>=i-2 && j<=8-i)
				{
					System.out.print(a);
					 
				}else{
					
				System.out.print("");
				}
				 
					
			}	
			if(i<3 )
					a=a+2;
			else if(i>=3)
			a= a-2;
						
			System.out.println();
		}
	}
}