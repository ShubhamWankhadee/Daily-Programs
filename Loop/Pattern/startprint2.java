
/*
			1
		3	3	3
	5	5	5	5	5	
	3	3	3
	1

*/



public class startprint2{
	public static void main(String args[]){
		int a=1;
		for(int i =1;i<=5;i++){
			 
			for(int j = 1;j<=5;j++){
				
				if(j>=4-i && j<=2+i && j>=6-i){
					
					System.out.print(a);
				}else{
					
					System.out.print(" ");
				}
			
			}
			 a= (i<3)?(a+2):a-2;
			 
			 
			System.out.println();
		}
	}
}