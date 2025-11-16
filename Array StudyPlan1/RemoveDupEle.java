/*
5.Remove Duplicate Elements
Concept: Compare each element with others and remove if already seen.
 Use Case: Eliminate duplicate entries in a list.
Input : arr = [2, 5, 3, 2, 8, 5, 6]
Array after removing duplicates: [2, 5, 3, 8, 6]

*/
public class RemoveDupEle{
	public static void main(String args[]){
		int arr[] = {2, 5, 3, 2, 8, 5, 6};
		int count=0;
		int p=0;
 
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					 arr[j] = -1;
					 count++;
				}	
			} 
			if(arr[i] != -1){
				arr[p] =arr[i];			
				p++;
			}
		}
		for(int i=0;i<=arr.length-count;i++){
			
			System.out.print(arr[i]+" ");
		}
		 
		
		
	}
}