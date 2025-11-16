/*
	1
	2	*	2
	3	*	3	*	3
	4	*	4	*	4	*	4
	3	*	3	*	3
	2	*	2
	1

*/

public class StarP49{
	public static void main(String args[]){
		 
		for(int i=1;i<=7;i++)
		{
				int a=2,b=3;
			for(int j=1; j<=7 ;j++)
			{
				if(i<=4 && j>=5-i && j<=3+i)
				{	if((i+j)%2 !=0 && a<=4){
						System.out.print(i);
					}else{
						System.out.print("*");
					}
					
				}else if(i>4 && j>= i-3 && j<=11-i)
					{
						if((i+j)%2 !=0 && a<=4){
						System.out.print(8-i);
						
					}else{
						System.out.print("*");
					}
			
					}
			}
			b--;
				
			System.out.println();
		}
	}
}
