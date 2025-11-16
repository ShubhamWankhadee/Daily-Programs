// Q51. Write a java program to display following series :
//           	1  2  2  4  3  6  4  8  5  10  6  12

public class Q51{
	public static void main(String args[]){
		 boolean flag = true;
		 int a=2,b=1;
		for(int i=1;i<=12;i++){
			 if(i%2==0){
				 System.out.print(a+" ");
				 a+=2;
			 }else{
				 System.out.print(b+" ");
				 b++;
			 }
				
			 
		}
		 
	}
}