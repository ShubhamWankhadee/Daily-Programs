/*

	#	# 	#	#	#
	*	*	*	*
	#	#	#
	*	*
	#

*/
public class StarPrint13 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // conditions: first column, diagonal, or last row
                if (j<i) {
                    System.out.print("\t");
                } else 
				{if(i%2 !=0) {
                    System.out.print("#\t");
                }else
					System.out.print("*\t");
				}
			}
            System.out.println();
        }
    }
}
