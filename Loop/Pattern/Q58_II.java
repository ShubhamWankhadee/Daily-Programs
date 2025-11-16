/*				1
			2	*	2
		3	*	3	*	3
	4	*	4	*	4	*	4
		3	*	3	*	3
			2	*	2
				1

*/

public class Q58_II{
	public static void main(String args[]){
		int i,j;
		for(  i =1;i<=7;i++){
			for(  j=1;j<=7;j++){
				if((i<=4 && j>=5-i && j<=3+i) || (i>4 &&  j>=i-3 && j<=11-i) ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
					
			}
			 
			j = (i <= 4) ? (j + 2) : (j - 2);
			System.out.println();
		}
		
		
	/*	 int a=1;
		for(int i =1;i<=7;i++){ 
	
			for(int j =1;j<=7;j++){
				if((i<=4 && j>=5-i && j<=3+i) || (i>4 &&  j>=i-3 && j<=11-i))  {
					 
					if((i+j)%2 !=0){
						System.out.print(a+" ");
					}else{
						System.out.print("* ");
					}
					
 				}
						
			}
			if(i<4){
				a++;
			}else{
				a--;
			}
			
			 
			System.out.println();
		}  */
		
		
		
		
		
	}
}