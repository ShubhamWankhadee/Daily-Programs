/*

Q8. WAP to create class name as Duck with two functions 
  void setValue(int no): this function is used for accept number as parameter 
  void checkDuck(): this function is used for check number is duck or not 


*/
import java.util.*;

class Duck{
	boolean flag = true;
	int no ;
	public void setValue(int no){
		this.no = no;
	}
	public void checkDuck(){
		 while(no>0){
			int rem = no%10;
			if(rem == 0){
				System.out.println("No is Duck!");
				flag = false;
				break;
			}
			no /=10;
		 }
		if(flag){
			System.out.println("No is Not Duck! ");
		} 
	}
	 
}
public class Q39{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		 
		Duck obj = new Duck();
		obj.setValue(no);
		obj.checkDuck();
	
	}
}