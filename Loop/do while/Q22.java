/*Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.


*/

import java.util.*;
public class Q22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int temp=no;
		int n=1;
		int sum=0;
		do{
			if( no%n==0){
				sum = sum+n;
				n++;
			}else
				n++;
			
		}while(no>n);
		System.out.println( sum);
		if(temp == sum){
			System.out.println("No is Perfect");
			
		}else{
			System.out.println("No is not perfect");
		}
		
	}
}