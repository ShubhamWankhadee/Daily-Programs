/*

Q7. WAP to create class name as Prime with two functions 
void setValue(int no): this function is used for accept number as parameter 
void checkPrime(): this function can check number is prime or not 



*/
import java.util.*;

class Prime{
	boolean flag = true;
	int no ;
	public void setValue(int no){
		this.no = no;
	}
	public void checkPrime(){
		 for(int i =2;i<no-1;i++){
		 
			if(no % i == 0){
				System.out.println("No is not prime!");
				flag = false;
				break;
			}
		 }
		if(flag){
			System.out.println("No is prime! ");
		} 
	}
	 
}
public class Q38{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		 
		Prime obj = new Prime();
		obj.setValue(no);
		obj.checkPrime();
	
	}
}