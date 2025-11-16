
/*

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A

*/

public class Q64
{
	public static void main(String args[])
	{
		/*
		char a = 'E';
			 int b= (int)a;
		 
		for(int i= 1;i<=5;i++)
		{
			 
			  
			for(int j =1;j<=5;j++)
			{
				 
				 
				if(j<=6-i){
					char c= (char)b;
			 
				     System.out.print(c+" ");
				    
				}else{
					System.out.print("  ");
				}
			}
			  b--;
			System.out.println();
		}
		*/
		int a=69;
		for(int i= 1;i<=5;i++)
		{
			 
			  
			for(int j =1;j<=5;j++)
			{
				if(j<=6-i){
					
				    System.out.print((char)a);
					
				}else{
					System.out.print("  ");
				} 
			}
			a--;
			System.out.println();
		}
	}
	
}