/*
Q39. Write a Java program to check whether a given number is a Harshad number 
(i.e., divisible by the sum of its digits) for numbers from 1 to n.
*/


import java.util.*;  
public class Q39{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two nos:");
	int no = sc.nextInt();
	int temp = no;
	int sum=0;
	while(temp>0){
		
		int rem = temp%10;
		sum+=rem;
		temp = temp/10;
	}
	 
	if(no%sum==0){
		System.out.println("No is Harshad");
	}else{
		System.out.println("No is not Harshad");
	}
	
	
	
  }
}