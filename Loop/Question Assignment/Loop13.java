//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;

public class Loop13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos:");
		int no = sc.nextInt();
		int ori =0;
		
		for(int i=0; no!=0;i++){
			ori *=10;
			  ori = ori+(no%10);
			
			no/=10;
		}System.out.println(ori);
	}
}