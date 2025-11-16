/*
Q6. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/

public class Q11{
	public static void main(String args[]){
		int arr[] = {12 , 35, 2, 10, 34, 1};
		
		
		 int max =arr[0], second= arr[0];
		for(int i =0;i<arr.length;i++){
			
			 
			  if(arr[i]>max){
				  second = max;
				  max = arr[i];
			  }else if(arr[i]>second && arr[i] != max){
				  second = arr[i];
			  }
			 
		}
		System.out.println("Secound largest no is: "+second);
		

		
		/*
		int a=0,b=0,max=0,max2 =0	;
		int store;
		for(int i =1;i<arr.length;i++){
			  a = arr[i];
				// largest no in Array
				   
			  if(a>max){
				  max=a; 
				  b=i;
					 
			  } 
	  
		}
		for(int i =1;i<arr.length;i++){
			  a = arr[i];
				// largest no in Array max index ingnore 
			if(arr[b] != arr[i]){
				if(a>max2){
				  max2=a; 
				 
					 
			  } 
			}		  
	  
		}

		  System.out.println(" Second largest no is:"+max2	);
		  
		 */
	}
}