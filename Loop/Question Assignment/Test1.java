/*
Q1. Write a Java program to find the length of the longest consecutive elements

sequence from an unsorted array of integers. Sample array: [49, 1, 3, 200, 2, 4, 70, 5] The longest consecutive elements sequence is [1, 2, 3, 4,

5],

therefore the program will return its length 5.
*/

public class Test1{
	public static void main(String args[]){
		int arr[] = {49, 1, 3, 200, 2, 4, 70, 5};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
				
			}
			
			
		}
		System.out.println(" /nOriginal Array !");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		// 1 2 3 4 5 49 70 200
		int count =1;
		int val =0;
		for(int i =1;i<arr.length;i++){
			 
			if(arr[i-1]+1 == arr[i]){
				count++;
				
			}else if(arr[i] != arr[i-1]+1){
				
				count =1;
			}
			if(count>val){
				val = count;
			}
				 
		}
		System.out.println("\n Consecutive no is: "+count);
		
	}
}