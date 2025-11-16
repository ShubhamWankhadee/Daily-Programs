/*
9. Find the Frequency of a Specific Element
Concept: Count how many times a given value appears in the array.
 Use Case: Count votes, survey results, repeated entries.
Input:  arr = [4, 5, 6, 4, 7, 4, 8]
Target element = 4
Frequency of element 4 is: 3

*/
public class Frequency{
	public static void main(String args[]){
		
		int arr[] = {4, 5, 6, 4, 7, 4, 8};
		int no=1;
		int max= 0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i] == arr[j]){
					count++;
					 
				}
			}
			if(max < count){
				no = arr[i];
				max= count;
			}
		}
		System.out.println("Frequency of Element "+no+" is: "+max);
	}
}