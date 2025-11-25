/*
    
Q13. WAP to create class name as Search with two functions 
 boolean isPresent(int  key,int …value): this function can search the key present in an
array or not if present returns true otherwise return false.

*/
import java.util.*;

class Search{
	 int value[];
	public boolean isPresent(int key ,int ...value){
		this.value = value;
		boolean flag = false;
		for(int i=0;i<value.length;i++){
			
			if(value[i] == key){
				flag = true;
				break;
			}
			
		}
		return flag;
	}
	
	 
}
public class Q43{

	public static void main(String args[]){
		 
		Search obj = new Search();
		int no=5;
		boolean store = obj.isPresent(no,10,20,30,4,0,50,98,4,55,5,2,6);
		 System.out.println(store);
	
	}
}