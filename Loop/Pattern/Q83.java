/*       1    
	   A   B   
	 2	  	 3  
   B	       C	 	
 4	 5	 6	 7	 8
*/


public class Q83{
	public static void main(String args[]){
		 
		 int no= 64,a=1;
		for(int i = 1;i<=5;i++){
			   
			for(int j=1;j<=9;j++){
				if((j+i ==6) || j==(4+i) || (i==5 && j%2!=0)){
					  
					 if(i%2==0){
						  no++;
						 System.out.print((char)no);
						 
						 
					 }else{
						 System.out.print(a);
						 a++;
					 }
					
					 
				}
				else
				{
					 
					System.out.print(" ");
					 
				}
				 
					
			}
		  
		System.out.println();
		}
	}
}