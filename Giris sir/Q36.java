/*


Q5. WAP to create class name as Perfect with two methods 
void setNum(int no): this function can accept number as parameter 
void findPerfect(): this function can check number is perfect or not



*/
import java.util.*;

class Perfect{

	int no ;
	public void setNum(int no){
		this.no = no;
	}
	public void showFactorial(){
		int sum =0;
		for(int i =1 ;i<=no/2;i++){
			if(no%i ==0){
				sum +=i;
			}
			
		}
		if(sum == no){
			System.out.println("No is Perfect! ");
		}else{
			System.out.println("No is not Perfect! ");
		}
		
	}
	 
}
public class Q36{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		 
		Perfect obj = new Perfect();
		obj.setNum(no);
		obj.showFactorial();
	
	}
}