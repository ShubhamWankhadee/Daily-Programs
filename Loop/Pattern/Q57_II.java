/* 	    		1
   		      1   1
    		1       1
 	      1           1
		1	2	3	4	1
*/

public class Q57_II{
	public static void main(String args[]){
		
		for(int i=1;i<=5;i++){
			int a=2;
			for(int j=1;j<=9;j++){
				if((i+j) == 6 || (i+4)==j){
					System.out.print("1 ");
				}else if(i==5 && j%2!=0){
					System.out.print(a+" ");
					a++;
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}	