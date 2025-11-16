/*
	1	2	3	4	5
	2	3	4	5	6
	3	4	5	6	7
	4	5	6	7	8
	5	6	7	8	9
	
*/


public class StarPrint23{
    public static void main(String[] args) {
        

        for (int i = 1; i <= 5; i++) {
				
            for (int j = i; j < 5+i ; j++) {
            	int count = j;	
			   System.out.print(count+ " ");
				count++;
			}
			 
			
            System.out.println();
        }
    }
}
