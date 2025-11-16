/*
Q3. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/

public class Q8{
	public static void main(String args[]){
		int arr[] = {1,2,4,5,7};
		int a =1;
	 
		
		System.out.print("Missing no is:");
		for(int i =0;i<arr.length;i++){
			if(a != arr[i]){
				 
				System.out.print(" "+a);
				a =arr[i];
			}
			 a++;
			
		}
		 
	}
}