/*
	A	B	C	D	E
	  A	  B	  C   D
		A	B	C
		  A	  B
			A
*/



public class Q68{
	public static void main(String args[]){
	 
		for(int i = 1;i<=5;i++){
			int no= 65;
			for(int j=1;j<=9;j++){
				
				 
				if(j>=i  && j<=10-i && (i+j)%2==0){
					 
					System.out.print((char)no);
					no++;
					 
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}