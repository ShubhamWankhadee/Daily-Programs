/*
	A	B	C	D	E
		1	2	3	4
			A	B	C
				1	2
					A	

*/



public class Q74{
	public static void main(String args[]){
		 
		 
		for(int i = 1;i<=5;i++){
			int no= 65,a=1;
			for(int j=1;j<=5;j++){

					if(j>=i){
						if(i%2!=0){
							System.out.print((char)no+" ");
							no++;
						}else{
							System.out.print(a+" ");
							a++;
						}
					}
					else{
						System.out.print("  ");	 
					}
					
			}
		System.out.println();
		}
	}
}