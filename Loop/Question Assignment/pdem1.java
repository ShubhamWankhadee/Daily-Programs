/*
ABCDEFGHGFEDCBA
ABCDEFG GFEDCBA
ABCDEF   FEDCBA
ABCDE     EDCBA
ABCD       DCBA
ABC         CBA
AB           BA
A             A
*/

public class pdem1{
	public void pattern(){
		
		
		for(int i=1;i<=8;i++){
			int no=65;
			for(int j=1;j<=15;j++){
				if((j<=8 && j<=9-i)|| (j>8 && j>=7+i)){
						System.out.print((char)no);
				 
				}else{
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		pdemo obj = new pdemo();
		
		obj.pattern();
	}
}