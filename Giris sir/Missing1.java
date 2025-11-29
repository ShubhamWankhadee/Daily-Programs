/*

*/
 public class Missing1{
	 public static void main(String args[]){
		 int arr[] ={0, 4, 5, 7};
		 // 1 2 3 6
		 int no= arr[0];
		 for(int i=0;i<arr.length;i++){
			 
				if(arr[i] !=no ){
				 while(arr[i]>no){	
					System.out.print(" "+ no);
					no++;
				 
				 }
				 
				}
			 
			 
			 no++;
		 }
		 
	 }
	 
 }