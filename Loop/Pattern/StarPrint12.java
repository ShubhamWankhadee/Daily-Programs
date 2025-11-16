/*
*
*	*
* 		*
*  			*
*	*	*	*	*

*/

public class StarPrint12 {
    public static void main(String[] args) {
         

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                // conditions: first column, diagonal, or last row
                if (i==j || j==1 || i==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}