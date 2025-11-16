/*
	*	*	*	*	*
	*			*
	*		*
	*	*
	*

*/


public class StarPrint14{
    public static void main(String[] args) {
         

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                // conditions: first column, diagonal, or last row
                if (i==1 || j==1|| 6-i==j) {
                    System.out.print("*");
                }else{
					System.out.print(" ");
				}
			}
            System.out.println();
        }
    }
}