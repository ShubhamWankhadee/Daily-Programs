/*
Q2. WAP to create class name as Power with function 
  void setNum(): this function accept two values first is base and second is index 
  void showPower(): this function can calculate the power of two numbers and display it.


*/
import java.util.*;

class Power{

	int base;
	int index;
	
	public void setNum(int base ,int index){
		this.base = base;
		this.index = index;
	}
	public void showPower(){
			int store =1;;
			  while(index >0){
				store = store*base;
				index--;
			  }
			  System.out.println("Power of tow no is: "+store);
	}
	 
}
public class Q33{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and index: ");
		int base = sc.nextInt();
		int index = sc.nextInt();
		Power obj = new Power();
		obj.setNum(base,index);
		obj.showPower();
	
	}
}