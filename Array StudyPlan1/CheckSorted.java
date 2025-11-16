/*
8. Check if Array is Sorted (Ascending or Descending)
Concept: Compare each element with the next and verify order.
 Use Case: Check data integrity or sort status.
Input: arr = [10, 20, 30, 40, 50]
Output: Array is sorted in ascending order.


*/

public class CheckSorted{
	public static void main(String args[]){
		int arr[] = {10, 20,30, 40, 50};
		boolean flag = true;
		if(arr[0] < arr[arr.length-1]){
			 
				for(int i=0;i<arr.length-1;i++){
					if(arr[i]>arr[i+1]){	
						flag= false;
						break;
					}
				}
				if(flag){
					System.out.println("Array is sorted in ascending order!");
				}else{
					System.out.println("Array is Not sorted!");
				}
				
		}else{
			
				for(int i=0;i<arr.length-1;i++){
					if(arr[i]<arr[i+1]){	
						flag= false;
						break;
					}
				}
				if(flag){
					System.out.println("Array is sorted in decending order!");
				}else{
					System.out.println("Array is Not sorted!");
				}
		}

	}
}