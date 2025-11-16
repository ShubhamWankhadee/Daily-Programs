
import java.util.*;
public class Neon{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		int ori =no;
		int sum =0;
		
		int square = no*no;
		while(no>0){
			  square = no%10;
			sum = sum + square;	
			no= no /10;
				
		}
		if(ori == sum){
			System.out.println("NO is Neon");
		}else{
			System.out.println("NO is Not Neon");
		}
		
	}
}