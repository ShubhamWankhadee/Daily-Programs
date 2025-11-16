/*


*/

public class startprint3
{
	public static void main(String args[])
	{
		int a=1;
		for(int i =1;i<=5;i++){
			 
			for(int j = 1;j<=5;j++){
				
				if(i<=3 && j>=4-i && j<=2+i){ // j>=6-i
					
					System.out.print("*");
								
				}else if(i>3 && j>=i-2 && j<= 8-i){
					
				
					   System.out.print("*");
					
				}
				else{
					System.out.print(" ");
				}
			
			}
		
			 
			 
			System.out.println();
		}
	}
}