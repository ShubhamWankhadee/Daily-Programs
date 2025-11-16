/*					*
				*		*
			*		*		*
		*		*		*		*
	*		*		*		*		*
		*		*		*		*
			*		*		*
				*		*
					*
*/

public class Q28_II{
	public static void main(String args[]){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if((j>=6-i && j<=4+i && i<=5)|| (j>=i-4 && j<=14-i && i>5)){
					if((i+j)%2==0){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}