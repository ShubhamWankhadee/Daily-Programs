/*

Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.

*/

import java.util.*;
public class Q22 {

    public static void count(int no) {
		 
		 boolean flag = false;
		 int sum =0;
		 for(int i=1;i<=no/2;i++){
			 if(no%i==0)
			 sum +=i;
			 
		 }
	
			if(sum == no){
				System.out.print("No is Perfect");
			}else{
				System.out.print("No is Not Perfect");
			}
		
    }
		 
	
	 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No: ");
		int no = sc.nextInt();
		
        count(no);
    }
}