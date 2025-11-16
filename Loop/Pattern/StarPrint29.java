/*

 	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1

	
*/


public class StarPrint29{
    public static void main(String[] args) {
  
		
        for (int i = 1; i <= 5; i++)
			{
			
				for (int j = 1; j <= 6-i; j++)
				{

					if(j%2==0)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(6-i+" ");
					}		
				}
				
			
            System.out.println();
        }
    }
} 
