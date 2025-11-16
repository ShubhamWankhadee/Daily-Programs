/*

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
	
*/


public class StarPrint25{
    public static void main(String[] args) {
        
		
        for (int i = 1; i <= 5; i++) {
				int no =6-i;
            for (int j = 1; j <= 5; j++) {
				
            	if(i<=j){
					System.out.print(no);
					no--;
					
					
				}else{
					System.out.print(" ");
				}
				
			}
            System.out.println();
        }
    }
} 
