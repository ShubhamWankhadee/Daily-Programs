/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.


*/


import java.util.*;
public class Q27{
	static int a=0;
	public static void Happy(int no){
	 
		int sum =0;
		while(no>0){
			int rem =no%10;
			  sum =sum +(rem*rem);
			  
			no /=10;
		}
		if(sum == 1){ 
			System.out.println("NO is Happy!");
		}else if(sum ==4){
			System.out.println("NO is Not  Happy!");
			 
		}else{
			Happy(sum); // Recursion
		}
		 
		
		System.out.println(a++); 
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		Happy(no);
	}
}