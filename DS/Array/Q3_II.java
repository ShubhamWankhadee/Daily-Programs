/*
Q3. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.

*/

 
public class Q3_II{
	public static void main(String args[]){
		 int arr1[] = {1 , 2, 3};
		 int arr2[] = {1 , 2, 3, 4, 5};
		 
		 int arr3[] = new int[arr1.length + arr2.length];
		  
		 int k =0;
		 // Merging array
		for(int i=0;i<arr1.length;i++)
		{
		  arr3[k++]=arr1[i];
		}
		for(int j =0;j<arr2.length;j++){
			arr3[k] =arr2[j];
			k++;
		}
		 
		for(int i=0;i<arr3.length;i++)
		{
		  System.out.print(arr3[i]+" ");
		}
		
		 
		for(int i=0;i<arr3.length;i++){
			int count=0;
			for(int j=0;j<i;j++){
				if(arr3[i] == arr3[j]){
					 count++;
				}
			}
			if(count == 0){
				System.out.print(" " +arr3[i]);
			}
		}
		
		
	}
}