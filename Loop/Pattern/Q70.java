/*
	1
	A	B
	1	2	3
	A	B	C	D
	1	2	3	4	5
*/



public class Q70{
	public static void main(String args[]){
	 
		for(int i = 1;i<=5;i++){
			int no= 65;
			for(int j=1;j<=5;j++){
				
				 
				if(j<=i){
					if(i%2==0){
						System.out.print((char)no+" ");
						no++;
					}else{
						System.out.print(j+" ");
					}
					
					 
				}else{
					System.out.print(" ");
				 
				}
			}
		System.out.println();
		}
	}
}