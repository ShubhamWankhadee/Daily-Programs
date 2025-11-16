/*
 					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
		1		2		3		4
			1		2		3
				1		2
					1
*/


public class StarP48{
	public static void main(String args[]){
		 
		for(int i=1;i<=9;i++)
		{
			 int a=1;
			for(int j=1; j<=9 ;j++)
			{
				
						if(i<=5 && j>=6-i && j<=4+i && (i+j)%2==0)
						{ 
							System.out.print(a);
								a++;
			
						}else if(i>5 && j>=i-4 && j<=14-i && (i+j)%2==0)
						{
							System.out.print(a);
							a++;
						}else{
						System.out.print(" ");
						}
						
					}
			
				System.out.println();
			
			
		}
	}
}
