// Q19. Write a java program to find the sum of the first and last digit of a number.

import java.util.*;
public class Q19 {

    public static void count(int no) {
		int ori =no;
		 int first,last;
		 last = no%10;
		 int count=0;
		 while(no>0){
			count++;
			no /=10;
			
		 }
		 
		 int n=1;
		 while(count>1){
			  n = n*10;
			  count--;
		 }
		 first = ori/n;
		 System.out.println("Sum of first and last digit is:"+( first+last));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No: ");
		int no = sc.nextInt();
		
        count(no);
    }
}
