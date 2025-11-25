/*


Q6. WAP to create class name Armstrong with two methods 
void setNum(int no): this function can accept number as parameter 
void checkArm(): this function can check number is armstrong or not 



*/
import java.util.*;

class Armstrong{

	int no ;
	public void setNum(int no){
		this.no = no;
	}
	public void checkArm(){
		int ori = no;
		int ori1 = no;
		int count=0;
		while(no>0){
			count++;
			no /=10;
		}
		int sum =0;
		while(ori1>0){
			int k =count;
			int rem =ori1%10;
			int store = rem;
				while(k>1){
					
					store = store*rem;
					k--;
				}
			sum += store;
			ori1 /=10;
		}
		if(sum == ori){
			System.out.println("No is Amstrong! "+sum);
		}else{
			System.out.println("No is not Amstrong! "+sum);
		}
		
	}
	 
}
public class Q37{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		 
		Armstrong obj = new Armstrong();
		obj.setNum(no);
		obj.checkArm();
	
	}
}