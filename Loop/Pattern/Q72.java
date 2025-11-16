/*
				1
			A	B	C
		2	3	4	5	6
	D	E	F	G	H	I	J
7	8	9	10	11	12	13	14	15
*/



public class Q72{
	public static void main(String args[]){
		int no= 65,n=1;
		for(int i = 1;i<=5;i++){
			
			for(int j=1;j<=9;j++){

					if(j>=6-i && j<=4+i){
						if(i%2==0){
							System.out.print((char)no+"\t  ");
						 no++;
						}else{
							System.out.print(n+"\t  ");
							n++;
						}
						
					}else{
						System.out.print("\t   ");
						 
					}
					
			}
		System.out.println();
		}
	}
}