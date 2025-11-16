// Q9. Write a java program to print a multiplication table of any number.


import java.util.*;
public class Q9{
	
	public static void table(int no){
		for(int i =1;i<=10;i++){
			System.out.println(i*no);
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		table(no);
	
	}
}