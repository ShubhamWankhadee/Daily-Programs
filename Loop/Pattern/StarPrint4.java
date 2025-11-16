/*

	     *
       * *
     * * *
   * * * *
 * * * * *
a
*/

public class StarPrint4{
	public static void main(String []args){
	int rows =5,cols=5;
	 for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                  if (6-i<=j) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // दोन space for alignment
                }
            
        }
		System.out.println();
	}
	}
}