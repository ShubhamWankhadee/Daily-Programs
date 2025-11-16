import java.util.*;
public class Automorphic{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		int ori =no;
		int ori1=no;
		
		 int count = 0;
		while(no>0){
			  
			count++;
			no= no /10;
				
		}
		while(count>0){
			 int rem = ori%10;
			sum = (sum*10)+ rem;	
			ori= ori /10;
			count--;
				
		}
		if(ori1 ==  ){
			System.out.println("NO is Neon");
		}else{
			System.out.println("NO is Not Neon");
		}
		
	}
}