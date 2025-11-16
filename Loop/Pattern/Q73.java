/*
A								I
	B						H
		C				G
			D		F
				E	

*/



public class Q73{
	public static void main(String args[]){
		int no= 65;
		 
		for(int i = 1;i<=5;i++){
			
			for(int j=1;j<=9;j++){

					if(i==j){
							System.out.print((char)no);
						 no++;
	
					}else if(j==(10-i)){
						int a=74-i;
						System.out.print((char)a);
						 
					}else{
						System.out.print(" ");	 
					}
					
			}
		System.out.println();
		}
	}
}