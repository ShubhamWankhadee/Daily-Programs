// Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class Q14 {

    public static void count(int no) {
        int rev = 0;
		int ori=no;
        while (no > 0) {
            int n = no % 10;   
            rev = rev * 10 + n;  
            no = no / 10;        
        }
        if(ori == rev)
			System.out.print("No is Palindrome!");
		else
			System.out.print("No is Not Palindrome!");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        count(no);
    }
}
