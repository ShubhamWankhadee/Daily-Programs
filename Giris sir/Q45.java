/*

Q15. Intersection of two Arrays
Given two arrays a[] and b[], the task is find intersection of the two arrays. Intersection of two arrays is
said to be elements that are common in both arrays. The intersection should not count duplicate
elements and the result should contain items in any order.
Input: a[] = {1, 2, 1, 3, 1},  b[] = {3, 1, 3, 4, 1}
Output: {1,  3}
Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of
common elements
Input: a[] = {1, 1, 1},  b[] = {1, 1, 1, 1, 1}
Output: {1}
Explanation: 1 is the only common element present in both the arrays.
Input: a[] = {1, 2, 3},  b[] = {4, 5, 6}
Output: {}

Explanation: No common element in both the arrays.
Your Task is : Note you have to create class name as Intersection with two methods 
void setArray(int a[],int b[]): this function is used for accept two array as parameter 
Int [] getIntersection(): this function can find the intersection of array and return it.

*/
import java.util.*;

class Intersection{
	int a[];
	int b[];
	 
	public void setArray(int a[],int b[]){
		this.a = a;
		this.b = b;
	}
	public void getIntersection(){
		for(int i =0;i<a.length;i++){
			int count =0;
			for(int j =i+1;j<b.length;j++){
				 if(a[i] == b[j] ){
					System.out.print(" "+a[i]); 	 
				 }
			}	  
		}
	}
	
	 
}
public class Q45{

	public static void main(String args[]){
		 
		Intersection obj = new Intersection();
		int a[] = {10,20,30,40,50,60};
		int b[] = {20,30,60,70,45,10};
		 
		obj.setArray(a,b);
		obj.getIntersection();
		
	
	}
}	