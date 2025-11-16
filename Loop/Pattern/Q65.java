	/*
				1
   		      1   1
    		1       1
          1     	  1
		1	2	3	4	1
		
		*/
public class Q65
{
	public static void main(String args[])
	{
		int a=2;
		for(int i= 1;i<=5;i++)
		{
			
			for(int j =1;j<=9;j++)
			{
				if(i+j == 6 || i+4 ==j )
				{
					System.out.print("1");
					 
					
				}else if(i ==5)
				{
					if(j%2 !=0 && j>1 &&j<9)
					{
						System.out.print(a);
						a++;
					}
					else{
						System.out.print(" ");
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