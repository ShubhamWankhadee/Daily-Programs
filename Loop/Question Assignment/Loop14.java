// Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;

public class Loop14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		int ori =no;
		int rev =0;
	
		for(int i=0;no!=0;i++){
			rev = rev*10;
		     rev =(no%10)+rev;
			
			no = no/10;
			
		}
		if(ori == rev){
			System.out.println("No is Palindrome");
			
		}else{
			System.out.println("No is not Palindrome");
		}
		
	}
}