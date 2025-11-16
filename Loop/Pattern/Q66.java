/*
Q1. Write a java program to print this pattern.

						A
					B	A
				C	B	A
			D	C	B	A
		E	D	C	B	A

*/

public class Q66{
	public static void main(String args[]){
		int no = 69;
		for(int i = 1;i<=5;i++){
			
			for(int j=1;j<=5;j++){
				
				 
				if(j>=6-i){
					no= 70-j;
					System.out.print((char)no);
					no--;
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}