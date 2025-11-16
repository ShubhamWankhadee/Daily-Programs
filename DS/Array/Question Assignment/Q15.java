/*
Q10. Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.

*/

public class Q15{
	public static void main(String args[]){
		int arr1[]= {1, 2, 3, 4, 5};
		int arr2[]= {3, 4, 5, 6, 7};
		
		int k=0;
		int count=0;
		for(int i =0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i] == arr2[j]){
					  //arr3[k] = arr1[i];
					  //k++;
					count++;
				}
				
			}
		}
		int arr3[] = new int[count];
		for(int i =0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i] == arr2[j]){
					  arr3[k] = arr1[i];
					  k++;
					 
				}
				
			}
		}
		
		System.out.print("Common Element in two array is:");
		for(int i =0;i<arr3.length;i++){
			System.out.print(" "+arr3[i]);
		}
		
	}
}