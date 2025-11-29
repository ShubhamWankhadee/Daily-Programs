
/*
       int a[]=new int[]{1,3,2,6,-1,4,1,8,2};
	   int max=Integer.MIN_VALUE;
	   int k=3;

*/


public class Sliding1{

	public static void main(String args[]){
		 
		int max=0;
		 int arr[]=new int[]{1,3,2,6,-1,4,1,8,2};
		int k =3;
		int first=0,end=0;
		int j;
		for(int i=0;i<=arr.length-k;i++){
		
			int sum=0;
			
			for(  j=i;j<(i+k);j++){
				sum +=arr[j];
				
			}
			if(max<sum){
				max =sum;
				first= i;
				 
				end = j;
			}
			
		}
		System.out.print("Max sum sub array is: "+max);
		for(int i=first;i<end;i++){
		System.out.print(" "+arr[i]);
		
		
		}
	}
}