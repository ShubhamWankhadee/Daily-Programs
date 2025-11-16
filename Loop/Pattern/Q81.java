/*
A      						A
A	B    				B	A
A	B	C  			C	B	A
A	B	C	D	D	C	B	A
A	B	C  			C	B	A
A	B   				B	A
A							A
*/


public class Q81{
	public static void main(String args[]){
		 
		 
		for(int i = 1;i<=7;i++){
			 int no= 65;
			for(int j=1;j<=8;j++){ 
				if((i<=4 &&(j<=i ||j>=9-i )) || ( ((i>4) && (  j<=8-i  || j>=i+1))  ) )   {      
					System.out.print((char)no);
					 
					 
				}else{
					System.out.print(" ");
				}
				 if(j<=4){
						if(j==4)
							continue;
						 else
						no++;
						
					}else if(j>=4) {
						no--;
					}
					
			}
		System.out.println();
		}
	}
}