/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,

*/

import java.util.*;
public class Q24 {

    public static void count(int no) {
		int ori=no;
		int sum =0;
		while(no>0){
			int dig=1;
			int rem =no%10;
				
				while(rem>0){
					dig = dig*rem;
					
					rem--;
				}
			sum += dig;
			no /=10;
		}
		if(sum == ori){
			System.out.println("No is Strong!");
			
		}else{System.out.println("No is Strong!");
			System.out.println("No is Not Strong!");
		}
    }
		 
	
	 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No: ");
		int no = sc.nextInt();
		
        count(no);
    }
}