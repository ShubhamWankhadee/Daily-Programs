//Q9. Write a java program to print a multiplication table of any number.
import java.util.*;
public class Q9{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the no:");
		 int no = sc.nextInt();
		int n=1;
		do{
			  int a =n*no;
			  
			  System.out.println(a);
			  n++;
			  
		}
		while(n<=10);
		 
	}
}