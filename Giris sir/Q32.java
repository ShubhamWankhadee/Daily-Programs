/*
Q31. WAP to create class name as Table with functions 
 void setValue():  this function is used for accept the number as input parameter 
 void showTable(): this function can display the table of numbers.

*/
import java.util.*;

  class Table{

	int no;
	
	public void setValue(int no){
		this.no = no;
	}
	public void showTable(){
			for(int i=1;i<=10;i++){
				System.out.println(no*i);
			}
	}
	 
}
public class Q32{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		Table obj = new Table();
		obj.setValue(no);
		obj.showTable();
	
	}
}