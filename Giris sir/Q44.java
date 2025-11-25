/*
    
Q14. Given two arrays, our task is to find their common elements. 
 Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”],
            Array2 = [“b”, “d”, “e”, “h”, “g”, “c”]
Output: [b, c, d, e]
Your Task 
________________________________________________________
You have to create class names s FindCommonElements with following methods 
void setArray(int a[],int b[]); this function can accept two array as parameter 
Int [] getCommonElements(): you have to create a new third array and find the common element and
return it.

*/
import java.util.*;

class FindCommonElements{
	  
	public void setArray(char a[] ,char b[]){
		 for(char i=0;i<a.length;i++){
			for(char j=0;j<b.length;j++){
				if( a[i] == b[j]){
					System.out.print(" "+a[i]);
				}
			}
		 }
	}
 
	
	 
}
public class Q44{

	public static void main(String args[]){
		 
		FindCommonElements obj = new FindCommonElements();
		char arr1[]={'a', 'b', 'c', 'd', 'e', 'f'};
		char arr2[]={'b', 'd', 'e', 'h', 'g', 'c'};
		obj.setArray(arr1,arr2);
		  
	
	}
}