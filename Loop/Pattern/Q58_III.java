/* 	    		1
   		      1   1
    		1       1
 	      1           1
		1	2	3	4	1
*/

public class Q57_II{
	public static void main(String args[]){
		for(int i=1;i<=9;i++0){
			for(int j=1;j<=5;j++){
				if(((i+j) == 6) || (i-4)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}	