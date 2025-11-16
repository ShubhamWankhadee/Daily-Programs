
/*
1        							1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1

*/

public class Q59
{
	public static void main(String args[])
	{
	 
		for(int i= 1;i<=5;i++)
		{
 
			for(int j =1;j<=10;j++)
			{
				
			  if(j>=i && j<=11-i && i<5){
					 System.out.print(" ");
			  }else if(j>=6){
					  System.out.print(11-j);
					 
					 
					  
					 
			 }else{
				  System.out.print(j);
			  
			 }
			   
			}
		 
			 
			 
			
		 
			
			System.out.println();
		}
	}
	
}