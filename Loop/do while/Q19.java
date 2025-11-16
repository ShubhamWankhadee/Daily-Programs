// Q19. Write a java program to find the sum of the first and last digit of a number.


import java.util.*;
public class Q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int first = no%10;
		do{
			no = no/10;
		}while(no>1);
		int sum = first+ no;
		System.out.println(sum);
		
	}
}