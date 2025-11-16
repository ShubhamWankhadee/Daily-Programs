/*  D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D

*/


public class Q85{
	public static void main(String args[]){
		 
		 
		for(int i = 1;i<=7;i++){
			   int no= 68;
			for(int j=1;j<=4;j++){
				if( (j<=i &&i<=4) || (i>4 && j<=8-i )){
					  	System.out.print((char)no+" ");
					 no--;
					 
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