/*
Q4. Write a program in java to find out the maximum difference 
between any two elements such that larger element appears 
after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8


*/


import java.util.*;
public class Q38{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.print("\n Enter the value in Array:");
		for(int i =0;i<a.length;i++){
			a[i] =  sc.nextInt();
		}
		System.out.print("\n  original array print:");
		for(int i =0;i<a.length;i++){
			 System.out.print(" "+a[i]);
		}
		

		 int max=0,first=0,last=0,diff=0;
		for(int i=0;i<a.length;i++){
			for(int j =i+1;j<a.length;j++){
				if(a[j] > a[i]){
					  diff = a[j] - a[i];
					if(diff > max){
						max = diff;
						first = i;
						last = j;
					}
				}else{
					  diff= a[i] -a[j];
					  if(diff>max){
						  max= diff;
						  first = i;
						  last=j;
					  }
				}
			}
		}
	 
		System.out.println(" greater diff: "+max+" from "+a[first]+ " to "+a[last]);
		 
	}
}