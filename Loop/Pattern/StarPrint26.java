/*

			1
		  1   2
	 	1	2	3
      1   2   3   4
	1	2	3	4	5
	
*/


public class StarPrint26{
    public static void main(String[] args) {
        int no =1;
		
        for (int i = 1; i <= 5; i++) {
			 int k =1;
            for (int j = 1; j <= 9; j++) {
				
            	if((j>= 6-i && j<= 4+i) && no == 1){
					
					System.out.print(k);
					k++;
					no = 0;
					
					
				}else{
					System.out.print(" ");
					no =1;
				}
				
			}
            System.out.println();
        }
    }
} 
