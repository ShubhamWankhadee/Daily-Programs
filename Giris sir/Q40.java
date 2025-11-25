/*


 Q9. WAP to create class name as Fibo with two functions 
void setLimit(int limit): this function is used for set the limit for fibonacci series 
void checkFibo(): this function can print the fibonacci series 



*/
import java.util.*;

class Fibo{
	boolean flag = true;
	int no ;
	public void setLimit(int no){
		this.no = no;
	}
	public void checkFibo(){
		int a =0,b=1;
		  for(int i=1;i<=no;i++){
			   
			  System.out.print(" "+a);
			  int c= a+b;
			   a = b;
			   b = c;
				
			  }
	}
	 
}
public class Q40{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int no = sc.nextInt();
		 
		Fibo obj = new Fibo();
		obj.setLimit(no);
		obj.checkFibo();
	
	}
}