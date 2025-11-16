/*
A
A	B	A
A	B	C	B	A
A	B	C	D	C	B	A
A	B	C	D	E	D	C	B	A	

*/



public class Q75{
	public static void main(String args[]){
		 
		 
		for(int i = 1;i<=5;i++){
			int no= 65;
			for(int j=1;j<=9;j++){

					if( j>=6-i && j<=4+i){ 
					 
							System.out.print((char)no+" ");
						if(j<5){
						 no++;
					 }else{
						 no--;
					 }	 
					
					}
					else{
						System.out.print("");	 
					}
					  
								
					
			}
		System.out.println();
		}
	}
}