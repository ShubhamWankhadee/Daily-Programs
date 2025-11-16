/*
			 *******
			 ******
 			 *****
 			 ****
 			 ***
 			 **
 			 *
 			 **
 			 ***
 			 **** 
 			 *****
 			 ******
 			 *******
*/

public class StarPrint5{
	public static void main(String []args){
	int rows =13,cols=7;
	 for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
				if((8-i>=j && i<=7) || (i>=7 && i-6>=j)){
					System.out.print(" *");
					
				}else{
					System.out.print(" ");
				}
            }
            System.out.println();
        }
	}
}