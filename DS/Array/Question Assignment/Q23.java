/*
Q3. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.

*/


import java.util.*;
public class Q23
{
	public static void main(String args[])
	{
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
		Arrays.sort(arr3);
		for(int i=0;i<arr3.length;i++)
		{
		  System.out.print(arr3[i]+" ");
		}
		// first aproch
		/*
		System.out.print("\n Unique no: ");
		for(int j=0;j<arr3.length;j++){
			int no= arr3[j];
			
			for(int i=0;i<arr3.length;i++){
				 int count =0;
				if(no == arr3[i]){
					arr3[i]=-1;
					count++;
				}
			}
			if(no != -1){
					System.out.print(" "+no);
				}
		}
		
		*/
		// Secound Approch
		System.out.print("\n Unique no: ");
		int countb=0,x=0;
		for(int j=0;j<arr3.length;j++){
			 int count=0;
			// i<j for to check 
			for(int i=0;i<j;i++){
				 
				if(arr3[j] == arr3[i]){
					 
					count++;
					
				}
			}

			if(count == 0){
				arr3[x] = arr3[j];
					System.out.print(" "+arr3[j]);
					x++;
			}else{
				countb++;
				
			}
		}
		System.out.print(" dubli: "+countb);
		System.out.print("\n In new array print:" );
		for(int i =0;i<arr3.length-countb;i++){
			System.out.print(" "+arr3[i]);
		}
		
 	}
}