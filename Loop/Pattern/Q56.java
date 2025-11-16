
/*
					1
				1	2	1	
           	1	2	3	2	1
		1	2	3	4	3	2	1
 			1	2	3	2	1	
				1	2	1	
					1



*/

public class Q56
{
	public static void main(String args[])
	{
		
		for(int i= 1;i<=7;i++)
		{
			int a=1;
			for(int j =1;j<=7;j++)
			{
				 
				if(j>=5-i && j<=3+i && i<=4)
				{
 
					if(j<4){
						 
						System.out.print(a);
						a++;
					}else{
						System.out.print(a);
					    a--;
					}
					 
					
				}else if(j>=i-3 && j<=11-i && i>4)
				{
					
					if(j<4){
						 
						System.out.print(a);
						a++;
					}else{
						System.out.print(a);
					    a--;
					}
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			
			System.out.println();
		}
	}
}