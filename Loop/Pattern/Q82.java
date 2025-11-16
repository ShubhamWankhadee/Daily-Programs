/*
A	B	C	D	E	D	C	B	A
A								A
A								A
A								A
A								A
*/


public class Q82{
	public static void main(String args[]){
		 
		
		for(int i = 1;i<=5;i++){
			  int no= 65;
			for(int j=1;j<=9;j++){
				if(i==1 ||j==1 ||j==9){
					 
					System.out.print((char)no);
					if(j<5)
					no++;
					else
						no--;
				}
				else
				{
					if(j<5)
					no++;
					else
						no--;
					System.out.print(" ");
					 
				}
				 
					
			}
		System.out.println();
		}
	}
}