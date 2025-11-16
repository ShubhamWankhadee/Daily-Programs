public class Q52_II{
	public static void main(String args[]){
		int a=1;
		for(int i =1;i<=7;i++){ 
			for(int j =1;j<=4;j++){
				
				if(( j>=5-i && i<=4) || (i>4 && j>=i-3)){
				 
						System.out.print(a);

					
				}else{
					System.out.print(" ");
				}
				 
					
			}
			if(i<4)
					a++;
				else
					a--;
			System.out.println();
		}
	}
}