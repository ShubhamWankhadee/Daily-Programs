/*
Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
  */


import java.util.*;  
public class Q26{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	int sum=0;
	int ori = no;
	int sq= no *no;
	
	while(sq>0){
		int rem= sq%10;
			sum = sum +rem;
		sq = sq/10;
		System.out.println(sum+"sum");
	}
	if(sum == ori){
		System.out.println("No is Neon");
	}else{
		System.out.println("No is not Neon");
	}
  }
  
}