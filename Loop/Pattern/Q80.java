/*
A
B	C
C		D
D			E
E	F	G	H	I
*/


public class Q80{
	public static void main(String args[]){
		 
		 int no= 68;
		for(int i = 1;i<=5;i++){
			 no=no-1;
			for(int j=1;j<=5;j++){
				if(i==5 ||j==1 ||i==j){
					if(i+j ==2){
					System.out.print("A");
					}else{
						System.out.print((char)no+" ");
					 no++;
					}
					
				}
				else
				{
					System.out.print("  ");
				}
				 
					
			}
		System.out.println();
		}
	}
}