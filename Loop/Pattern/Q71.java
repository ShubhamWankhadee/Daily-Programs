/*
	1	A	2	B	3
	C	4	D	5	E
	6	F	7	G	8
	H	9	I	10	J
	11	K	12	L	13
*/



public class Q71{
	public static void main(String args[]){
		int no= 65,n=1;
		for(int i = 1;i<=5;i++){
			
			for(int j=1;j<=5;j++){

					if((i+j)%2==0){
						System.out.print(n+"   ");
						 n++;
					}else{
						System.out.print((char)no+"   ");
						no++;
					}
					
			}
		System.out.println();
		}
	}
}