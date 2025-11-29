/*
 Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}


*/
 
 public class Missing{
	 public static void main(String args[]){
		 int arr[] ={0, 4, 5, 7};
		 
		 int no= arr[0];
		 for(int i=0;i<arr[arr.length];i++){
			 
			 if(arr[i] !=no ){
				 
				 System.out.print(" "+no);
				 no =arr[i];
				 
				 
			 }
			 no++;
		 }
		 
	 }
	 
 }