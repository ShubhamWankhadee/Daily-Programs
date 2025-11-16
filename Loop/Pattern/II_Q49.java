/*
	1	1	1	1	1	1	1
		2	2	2	2	2	
			3	3	3	
				4
			5	5	5
		6	6	6	6	6
	7	7	7	7	7	7	7
*/
public class II_Q49{
	public static void main(String args[]){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if((j>=i && j<=8-i && i<=4) || (i>4 && j>=8-i && j<=i)){
					System.out.print(i);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}