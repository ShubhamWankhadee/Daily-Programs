/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.


*/

import java.util.*;
public class Q25 {

    public static void count(int no) {
		int ori=no;
		int no1 =no;
		
		int count=0;
		while(no>0){
			count++;
			no /=10;
		}
		int store=0;
		while(no1>0){ //145
			int rem = no1%10;
			int cdig=  count;
			int sum =1;
				while(cdig>0){
					 sum  *=rem;
					
					cdig--;
				}System.out.println("No is !"+sum);
			  store+=sum;
			no1 /=10;
			
		}
		
		if(store == ori){
			System.out.println("No is Amstrong!");
			
		}else{ 
			System.out.println("No is Not Amstrong!");
		}
    }
		 
	
	 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No: ");
		int no = sc.nextInt();
		
        count(no);
    }
}