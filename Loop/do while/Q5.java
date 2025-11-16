// Q5. Write a java program to print all odd numbers between 1 to 100.
import java.util.*;
public class Q5{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the no:");
		 int no = sc.nextInt();
		 int n=1;
		do{
			if(n%2!=0){
				System.out.println(n);
			}
			n++;
		}
		while(n<=no);
	}
}