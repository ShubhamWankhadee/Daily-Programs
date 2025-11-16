// Star print
/*

 * * * * * * *
  * * * * * *
   * * * * *
    * * * *
	 * * *
	  * *
	   *

*/
public class Patt1{
	public static void main(String args[]){
	
		for(int i =1;i<=7;i++){
			for(int j =1;j<=13;j++){
				if((j>=i && j<=14-i ) ){
					if((i+j)%2 == 0){
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