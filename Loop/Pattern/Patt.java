 
 
public class Patt{
	public static void main(String args[]){
	
		for(int i =1;i<=9;i++){
			for(int j =1;j<=9;j++){
				if((j>=6-i && j<=4+i && i<=5) || (i>5 && j>=i-4 && j<=14-i) ){
					
					
					
					if((i+j)%2==0){
						if((i<=5 && ( 6-i ==j || (j-i) == 4)) || (i>5 && (i-j) == 4 || (14-i)==j)){
							System.out.print("*");
						}else if(j==5 && i>=4 && i<=6){
							System.out.print("+");
						}  
						else{
							System.out.print(" ");
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