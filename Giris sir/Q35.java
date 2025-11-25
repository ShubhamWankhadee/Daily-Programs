/*

Q4. WAP to create  class name as Rev with two functions 
   void setValue(): this function is used for accept number 
   void showRev(): this function is used for reverse the number


*/
import java.util.*;

class Rev{

	int no ;
	public void setValue(int no){
		this.no = no;
	}
	public void showFactorial(){
			int store=0;
			 while(no>0){
				int rem = no%10;
				store = store * 10+rem;
				no /=10;
			 }
			  System.out.println("Reverse no is: "+store);
	}
	 
}
public class Q35{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		 
		Rev obj = new Rev();
		obj.setValue(no);
		obj.showFactorial();
	
	}
}