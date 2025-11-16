/*

Q4. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8
		

*/

public class Nextbig{
	public static void main(String args[]){
		
		int arr[] = {1,2,3,5,1,5,20,2,12,10};
		  
		
		for(int i=0;i<arr.length;i++){ 
		 boolean flag = true;
			for(int j=i+1;j<arr.length;j++){
				 
					 
				if(arr[i] ==  arr[j]){
				 flag = false;
				  arr[j] =-1;
				
				}
				 
				
			}
			 if(flag && arr[i]!=-1){
					 System.out.print(" "+arr[i]);
				 }
			 
		}
		 
		
		 
	}
}