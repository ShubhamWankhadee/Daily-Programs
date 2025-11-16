/*

 Use Case: Eliminate duplicate entries in a list.
Input : arr = [2, 5, 3, 2, 8, 5, 6]
Array after removing duplicates: [2, 5, 3, 8, 6]


*/
 
import java.util.*;
public class exammpla{
	public static void main(String []args){
		int arr1[] = {2, 5, 3, 2, 8, 5, 6};
		int arr2[] = {7,5, 5, 6};	     
		int arr3[] = new int[arr1.length + arr2.length];
		 int k=0,n=0;
		 for(int i=0;i<arr3.length;i++){
		 
				if(k<arr1.length){
					arr3[i] = arr1[k];
					k++;
				}else{
					arr3[i] = arr2[n];
					n++;
				}
			 
		 }
		  for(int i=0;i<arr3.length;i++){
		 
			System.out.print(" "+arr3[i]);
		 }
				 
			 
	}

}