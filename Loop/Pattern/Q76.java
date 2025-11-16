/*								A
						1	2	1
				A	B	C	B	A
		1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A
	

*/



public class Q76{
	public static void main(String args[]){
		 int x=9;
		for(int i=1;i<=5;i++){
			 int a=1,count=0,no=65;
			 
			for(int j=1;j<=9;j++){
				
				if(j>=x){//j>=x
					if(i%2==0){
						 count++;
						  if(count<i){
							 
							  System.out.print(a);
							  a++;
						  }
						  else{
							   System.out.print(a);
							  a--; 
						  }
						 
					}else{
						count++;
						 
						   if(count<i){
							 System.out.print((char)no);
								no++;
						  }
						  else{
							   System.out.print((char)no);
							   no--;
						  }	
					}	   	
				}
				else{
					System.out.print(" ");
				}
				 
			}
			x-=2;
			System.out.println();
		}
	}
}