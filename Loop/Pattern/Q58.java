
/*
1       						9
	2     					8
  		3				7
   			4		6
				5
   			4 		6
  		3   			7
    2     					8
1       						9

*/

public class Q58
{
	public static void main(String args[])
	{
		
		int a=1,b=9;
		for(int i= 1;i<=9;i++)
		{
			 
			for(int j =1;j<=9;j++)
			{
				if(i==j){
					 
					System.out.print(a+" ");
 				}else if(10-i == j){
					System.out.print(b+" ");
				}
				else{
					System.out.print("   ");
				}
				 

			}
			a++;
			b--;
			
			System.out.println();
		}
	}
}