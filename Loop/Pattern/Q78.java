/*
A 	B 	C 	D
A     		D
A			D
A	B	C	D
*/


public class Q78{
	public static void main(String args[]){
		 
		 
		for(int i = 1;i<=4;i++){
			int no= 65;
			for(int j=1;j<=4;j++){

					if(i==1|| j==1 || i==4 || j==4){ 
						System.out.print((char)no+" ");
						 no++;
					}
					else{
						System.out.print("  ");	
						no++;	 
					}
					  
								
					
			}
		System.out.println();
		}
	}
}