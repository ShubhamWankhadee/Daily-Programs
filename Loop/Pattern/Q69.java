/*
	A	1	2	3	4
	A	B	1	2	3
	A	B	C	1	2
	A	B	C	D	1
	A	B	C	D	E
*/



public class Q69{
	public static void main(String args[]){
	 
		for(int i = 1;i<=5;i++){
			int no= 65,n=1;
			for(int j=1;j<=5;j++){
				
				 
				if(j<=i){
					 
					System.out.print((char)no+" ");
					no++;
					 
				}else{
					System.out.print(n+" ");
					n++;
				}
			}
		System.out.println();
		}
	}
}