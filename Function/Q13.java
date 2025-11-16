// Q13. Write a java program to enter a number and print its reverse

import java.util.*;
public class Q13 {

    public static void count(int no) {
        int rev = 0;
        while (no > 0) {
            int n = no % 10;    
            rev = rev * 10 + n; 
            no = no / 10;        
        }
        System.out.println("Reverse no is: " + rev);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        count(no);
    }
}
