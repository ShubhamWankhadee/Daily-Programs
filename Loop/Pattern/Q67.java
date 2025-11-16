/*
			A
		  A   B
		A	B	C
      A   B   C   D
	A	B	C	D	E
*/



public class Q67{
	public static void main(String args[]){
	 
		for(int i = 1;i<=5;i++){
			int no= 65;
			for(int j=1;j<=9;j++){
				
				 
				if(j>=6-i  && j<=4+i && (i+j)%2==0){
					 
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