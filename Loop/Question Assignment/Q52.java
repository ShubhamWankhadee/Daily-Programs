//Q52. Write a java program to display following series :
 //          	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1
 
 public class Q52{
	public static void main(String args[]){
 
		 int a=2,b=9;
		 int sum =0;
		for(int i=1;i<=18;i++){
			int  no=3;
			sum =b;
			 if(i%2==0){
				 while(no>1){
					 sum = sum*b;
					 no--;
				 }
				 System.out.print(sum+" ");
				 b--;
			 }else{
				 System.out.print(a+" ");
				a+=2;
			 }
				
			 
		}
		 
	}
}