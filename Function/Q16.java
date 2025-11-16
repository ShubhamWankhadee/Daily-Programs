// Q16. Write a java program to find power of a number.


import java.util.*;
public class Q16 {

    public static void count(int base,int index) {
		int power =1;
		for(int i=1;i<=index;i++){
			  power = power*base;
			  
		}
		System.out.println("Power of No is:"+power);
      
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base: ");
        int base = sc.nextInt();
		System.out.print("Enter the index: ");
        int index = sc.nextInt();

        count(base,index);
    }
}
