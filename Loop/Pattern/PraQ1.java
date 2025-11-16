/*  *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

public class PraQ1{
	public static void main(String args[]){
		for(int i=0;i<=9;i++){
			for(int j=0;j<=9;j++){
				if((j>=6-i && j<=4+i && i<=5) || (i>5 && j>=i-4 && j<=14-i)){
					if()
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

