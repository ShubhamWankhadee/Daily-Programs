/*

		*  *  *  *  *  *  *  *  *
		   *  *  *  *  *  *  *
		      *  *  *  *  *
				 *  *  *
			        *
*/

public class StarPrint11{
	public static void main(String []args){
	int rows =5,cols=9;
	 for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                
				 if(j<=10-i && i<=j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				 
				
            }
            System.out.println();
        }
	}
}