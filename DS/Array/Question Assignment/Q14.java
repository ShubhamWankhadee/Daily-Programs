/*
Q9.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/

public class Q14{
	public static void main(String args[]){
		int arr[] = {10,20,20,30,40,40,50};
				 

	 
	 
		 System.out.println("Unique Elements:");
	 /*
		for(int i=0;i<arr.length-1;i++){
			int no =arr[i];
			 for(int j=0;j<arr.length-1;j++){
				 
					if(no == arr[j]){
						arr[j]= -1;
					}
				}
				if(no != -1){
					System.out.print(" "+no);
				}
				
				
		}
		*/
		 
		 for(int i=0;i<arr.length-1;i++){
			 int count=0;
			 for(int j=0;j<i;j++){
				 
					if(arr[i] == arr[j]){
						count++;
					}
				}
				if(count == 0){
					System.out.print(" "+arr[i]);
				}
				
				
		}
	 
		 
	  
		 
	}
}