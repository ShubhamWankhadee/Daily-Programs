/*


	1	2	3	4	5	6	7	8	9
		1	2	3	4	5	6	7
			1	2	3	4	5	
				1	2	3
					1
	
*/


public class StarPrint27{
    public static void main(String[] args) {
  
		
        for (int i = 1; i <= 5; i++) {
			 int k =1;
            for (int j = 1; j <= 9; j++) {
				
            	if(i <= j && j<= 10-i){
					
					System.out.print(k);
					k++;
				 
					
					
				}else{
					System.out.print(" ");
				 
				}
				
			}
            System.out.println();
        }
    }
} 
