/*
					A
				#	#	#
			A	B	C	B	A
		#	#	#	#	#	#	#
	A	B	C	D	E	D	C	B	A
		#	#	#	#	#	#	#
			A	B	C	B	A
				#	#	#
					A
*/


public class Q77{
	public static void main(String args[]){
		 
		 
		for(int i = 1;i<=9;i++){
			int no= 65;
			for(int j=1;j<=9;j++){

					if((i<=5 && j>=6-i && j<=4+i) || (i>5 && j>=i-4 && j<=14-i)){ 
					 
						 if(i%2==0){
							 System.out.print("#");
						 }else{
								System.out.print((char)no);  
							 
						 }
							 
							 if(j<5)
								no++;
							else
								no--;
							  
								
					}else{
							System.out.print(" ");	 
					} 	
 

					
					  
			}				
					
			
		System.out.println();
		}
	}
}