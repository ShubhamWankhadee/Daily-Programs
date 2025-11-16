/*
1	A	2	B	3  
  C	  4   D   5  
	6	E	7  
  F   8   G   9  
H	10	I	11	J
*/


public class Q84{
	public static void main(String args[]){
		  boolean flag= true;
		 int no= 65,a=1;
		for(int i = 1;i<=5;i++){
			   
			for(int j=1;j<=9;j++){ 
				if((j>=i && j<=10-i && i<=3) || (i>3 && j>=6-i &&j<=i+4)){
					 
						 
						
							if((i+j)%2==0 ){						
								 if(flag == false){
									 System.out.print((char)no);
									 no++;
									 flag= true;
								 }else if(flag == true){
									 System.out.print(a);
									 a++;
									 
									 
									 // digit on next line
									 if(a==6){ // or (i+j)==10 && i==2
										 flag=true;
									 }else{
										 flag=false;
									 }
									 
								 }
								}							
								else{
							 			System.out.print(" ");													
								} 
					}else{
					System.out.print(" ");
					}	
				}System.out.println();
			}
		}
}