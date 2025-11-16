
/*
	  	    1
		  1	  1
		1	2	1
      1   3   3   1
	1	4	6	4	1


*/

public class Q57
{
	public static void main(String args[])
	{
		
		for(int i= 1;i<=5;i++)
		{
			 
			for(int j =1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i && (i+j)%2 ==0)
				{
					if(i+j==6 || (i+4 == j && i>1)){
					
						System.out.print("1");
					}else if(i+j==10 && i==5){
						System.out.print("6");
					}else
					{
						System.out.print(i-1);
					}
					 
					
				}else{
					System.out.print(" ");
				}
				
				
			}
			 
			
			System.out.println();
		}
	}
}