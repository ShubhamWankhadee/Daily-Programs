/*
Q9. Write a Java program to count how many even numbers are present in an array.
Return the count.

*/

public class Q9{
	 
	static int Ecount=0;
	public static int EC(int arr[],int i){
			if(i <arr.length){ 
				 if(arr[i]%2 !=0){
					Ecount++;
				 }
				EC(arr,i+1); // Recursion
			}
				
			return Ecount;
	}
	public static void main(String args[]){
		int arr[] = {10, 15, 8, 7, 9, 12};
		  int i= 0;
		int ecount =EC(arr,i);
		System.out.println("Even no element present in array is: "+ecount);
	 
	}
}