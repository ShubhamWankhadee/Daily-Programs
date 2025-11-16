/*
Q1. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.

*/



import java.util.*;
public class Q21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		System.out.println("Enter the Value of Array:");
		int arr[] = new int[size];
	   
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();	
		}
		System.out.println("Print Orijinal Array");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);	
		}
 
		for(int j=0;j<arr.length;j++){
			for(int i=0;i<arr.length-j;i++){
				if(arr[i] == 0){
					int temp = arr[i];
					arr[i] = arr[arr.length-1];
					arr[arr.length-1] = temp;
				}
			 
			}
		}
		
		
		System.out.println("\nZero elements is last:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
 	}
}