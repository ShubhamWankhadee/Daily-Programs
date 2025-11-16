public class patternLoop2
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=7;i++)
		{
				 
			for(int j=1; j<=7 ;j++)
			{
				 
				if(j>=4-i && j<=2+i && i<=3)
				{
					  System.out.print(i);
					 
					 
				}
				else if(i>3 && j>=i-2 && j<=8-i)
				{
					  
						System.out.print(i);
					
					 
				}else{
					
				System.out.print("");
				}
		
					
			}	
		
						
			System.out.println();
		}
	}
}