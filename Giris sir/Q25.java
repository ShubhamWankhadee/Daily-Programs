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

class Insertion{
	
	private int a[];
	private int b[] ;
	
	public void setValue(int []a,int []b){
		this.a = a;
		this.b = b;
		
	}
	public void Sorting(){
		int arr[] =new int[5];
		int no=0;
		for(int i=0;i<a.length;i++){
			if(logic(a[i] ,b) && !logic(a[i] ,arr)){
				arr[no++] = a[i];
			}
		}
		System.out.println("Intersection no is: ");
		for(int i=0;i<no;i++){
			System.out.print(" "+arr[i]);
		}
	
	}
	public boolean logic(int a ,int b[]){
		
		for(int i=0;i<b.length;i++){
			if(b[i] == a){
				return true;
			}
		}
		return false;
	}
	
	
}
public class Q25{
	public static void main(String args[]){
		Insertion obj = new Insertion();
		 int a[]= {1, 2, 1, 3, 1};
		 int b[]= {3, 1, 3, 4, 1};
		  obj.setValue(a,b);
	}
}