/*
A	B	C	D	E	D	C	B	A	
A	B	C	D	  	D	C	B	A	
A	B	C    			C	B	A
A	B     					B	A
A       						A
A	B     					B	A
A	B	C   			C	B	A
A	B	C	D 		D	C	B	A
A	B	C	D	E	D	C	B	A
*/


public class Q79{
	public static void main(String args[]){
		 
		 
		for(int i = 1;i<=9;i++){
			int no= 65;
			for(int j=1;j<=9;j++){

					 if(( (j<=6-i || j>=4+i )&& i<=5)|| (i>=5 && (j<=i-4 || j>=14-i) ) ){//  
						 System.out.print((char)no+" ");
						 if(j<5){
							 no++;
						 }else{
							 no--;
						 }
					 }else{// for the space also count
						 System.out.print("  ");
						 if(j<5){
							 no++;
						 }else{
							 no--;
						 }

					 }
					  
								
					
			}
		System.out.println();
		}
	}
}