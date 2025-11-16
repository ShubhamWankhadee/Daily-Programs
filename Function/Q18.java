// Q18. Write a java program to find the first and last digit of a number.

import java.util.*;
public class Q18 {

    public static void count(int no) {
		 int ori = no;
		 int count=0;
		 int last = no%10;
		 int n=1;
		 
		 while(no>0){
			count++;
			no = no/10;
			 
		 }
		 
		 while(count > 1){
			 n = n*10;
			 count--;
		 }
		 int first = ori/n;
		 
		 System.out.println("first no is:"+first);
		 System.out.print( "Last no is:"+last);
		
			
		
    }
		 
	
	 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No: ");
		int no = sc.nextInt();
		
        count(no);
    }
}
