// Q17. Write a java program to find all factors of a number.

import java.util.*;
public class Q17 {

    public static void count(int no) {
		for(int i=1;i<=no/2;i++){
			if(i%2==0)
			{
				System.out.print(", "+i);
			}
		}
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No: ");
		int no = sc.nextInt();
		
        count(no);
    }
}
