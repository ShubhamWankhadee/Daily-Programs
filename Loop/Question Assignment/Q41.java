/*
	Q41. Write a Java program to find the largest and smallest digit of a given number.
	Explanation:
	Use a while loop to extract digits, compare each digit to track max and min.
*/


import java.util.*;
public class Q41{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no= sc.nextInt();
		int ori = no;
		int a=0,b=0,temp = no;
		
		while(temp>1){ 
			int rem = temp%10; 	
				while(ori>1){
					int rem1= ori%10;
						if(rem<=rem1){
							a=rem1;
							//System.out.println("a"+a);
						}else if(rem<rem1){
							//System.out.println("b"+b);
							b=rem1;
						}
						
					ori = ori/10;
				}
				
				
			temp = temp/10;
		}
		System.out.println("Largest no is:"+a);
		System.out.println("Smallest no is:"+b);
		
	}
}