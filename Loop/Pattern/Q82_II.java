/* 	1   A	2	B	3  
      C   4   D   5  
		6	E	7  
      F   8   G   9  
	H	10	I	11	J
*/

public class Q82_II {
	public static void main(String ars[]){
	
			char a ='A';
			int b =1;
			boolean flag = true;
		for(int i=1;i<=5;i++){
			 
			for(int j=1;j<=9;j++){
				
				if((j>=i && j<=10-i && i<=3) || (i>3 && j>=6-i && j<=4+i)){
					 if((i+j)%2==0){
						 if(flag){
								System.out.print(b);
								 b++;
								 if(b==6){
									 flag=true;
								 }else
								flag = false;
							}else{
								System.out.print(a);
								a++;
								flag = true;
							}  
						
						 
					 }
					else{
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