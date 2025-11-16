/*

 Use Case: Eliminate duplicate entries in a list.
Input : arr = [2, 5, 3, 2, 8, 5, 6]
Array after removing duplicates: [2, 5, 3, 8, 6]


*/
 
import java.util.*;
public class Dubli{
	public static void main(String []args){
		int arr[] = {2, 5, 3, 2, 8, 5, 6};
			     
		  int count =0,k=0;
           for(int i =0;i<arr.length;i++){
			     
				for(int j =i+1;j<arr.length;j++){
					if(arr[i] == arr[j]){
						
						arr[j] = -1;
						 if(arr[i] != -1)
							count++;
					}
					
				}
				if(arr[i] != -1){
					arr[k] = arr[i];
					k++;
				}
				
				 
		   }
		   
		   
		   
		   System.out.println("No is :...................."+count);
		   		for(int j =0;j<arr.length-count;j++){
					 
					
					System.out.print(" "+arr[j]);
					
				}
		   		 
        
	
	}

}