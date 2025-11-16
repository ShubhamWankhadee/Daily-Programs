// sExample: WAP to insert value in array on specified index and move other index by 1.

import java.util.*;
public class InsertIdx{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in Array");
		
		int a[] = new int[6];
		for(int i=0;i<a.length-1;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index:");
		int kser = sc.nextInt();
		System.out.println("Enter the Value:");
		int value = sc.nextInt();
		System.out.println("Array before the Inserting");
		
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+" ");
		}
		// move forword right hand side
		
		for(int i=a.length-2;i>=kser;i--){
			a[i+1] =a[i];
		}
		a[kser] = value;
		
		System.out.println("\nAfter Insert value in Array is:");
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}



