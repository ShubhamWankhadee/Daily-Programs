/*
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7 
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
*/

public class pattern12{

	public static void main(String args[]){
		int no=0;
		for(int i=1;i<=13;i++){
			if(i<=7)
				  no=i;
			else{
				no=14-i;
			}
			for(int j=1;j<=13;j++){
				if((i<=7 &&j>=i && j<=14-i) || (i>7 && j>=14-i && j<=i)){
					if((i+j)%2==0){
					
						System.out.print(no);
						 no++;
					} else{
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