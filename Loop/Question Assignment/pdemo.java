/*  1
   1*2
  1*2*3
 1*2*3*4
1*2*3*4*5
 1*2*3*4
  1*2*3
   1*2
    1

*/

public class pdemo{
	public void pattern(){
		
		
		for(int i=1;i<=9;i++){
			int no=1;
			for(int j=1;j<=9;j++){
				if((i<=5 && j>=6-i && j<=4+i) || (i>5 && j>=i-4 && j<=14-i)){
					if((i+j)%2 == 0){
						System.out.print(no);
						no++;
					}
					else
						System.out.print("*");
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