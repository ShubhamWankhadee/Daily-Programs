/*
Q5. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5

*/

public class delete{

	public static void main(String args[]){
		
		int arr[] ={1, 2 ,3 , 4 , 5};
		int idx =3;
		
		for(int i=3;i<arr.length-1;i++){
				 
				  arr[i]=arr[i+1]; 
				 
		}
		for(int i=0;i<arr.length-1;i++){
				 System.out.print(" "+arr[i]);
				 
				 
		}
		
		
		
		
	}
}