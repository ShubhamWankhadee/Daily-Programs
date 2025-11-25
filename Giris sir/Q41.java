/*


Q10. WAP to create class name as FindMax with two functions 
void setValue(int …x): this function accept infinite parameter from calling
int  getMax(): this function can find the value from the function and return it.



*/
import java.util.*;

class FindMax{
	int max=0;
	public void setValue(int ...no){
		System.out.println(no);
		 for(int i=0;i<no.length;i++){
			if(no[i]>max){
			
				max = no[i];
			}
		 }
	}
	public int getMax(){
		return max;
	}
	 
}
public class Q41{

	public static void main(String args[]){
		 
		FindMax obj = new FindMax();
		obj.setValue(10,20,30,4,0,50,98,4,55,5,2,6);
		int result = obj.getMax();
		System.out.println("Max no is: "+result);
	
	}
}