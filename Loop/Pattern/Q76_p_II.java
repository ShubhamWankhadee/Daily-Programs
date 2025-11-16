/*								A
						1	2	1
				A	B	C	B	A
		1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A
	

*/


public class Q76_p_II{
	public static void main(String args[]){
		 int x=9 ;
		for(int i = 1;i<=5;i++){
			 int no=65,a=1,count =0;
			for(int j=1;j<=9;j++){
				 
				if(j>=x){
					 if(i%2!=0){
						 // print A B C D
						System.out.print((char)no+" ");
							// to check inc / dec
							count++;
							// if count<i then ++ rather than --.
						if(count<i){
							no++;
						}else{
							no--;
						}
						  // no =(count<i)? (no+1) :(no-1);
						 	 
								
					 }else{
						 // print 1 2 3 
						 System.out.print(a+" ");
						 
						 count++;
						 if(count<i){
							a++;
						}else{
							a--;
						}
					 }
					  
						
					 
				}else{
					
					System.out.print("  ");
				}
			}
			// for j-2
			 x=x-2;
			 // new line
		System.out.println();
		}
	}
}