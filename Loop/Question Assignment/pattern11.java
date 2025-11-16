public class pattern11{

	public static void main(String args[]){
		
		for(int i=1;i<=8;i++){
			int no=65;
			for(int j=1;j<=15;j++){
				if((j<=8 && j<=9-i)|| (j>8 && j>=7+i)){
						System.out.print((char)no+" ");
 
				}else{
					System.out.print("  ");
				}
						if(j<8){
							no++;
						}else{
							no--;
						}
				 
					
			}
			System.out.println();
		}
	
	}
}