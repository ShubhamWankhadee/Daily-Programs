/*
Q46. Write a Java program to display all Twin Primes between 1 and n.
 Twin Primes are pairs of prime numbers that differ by 2.
 Example: (3, 5), (5, 7), (11, 13).
*/



import java.util.*;
public class Q46{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int a =0;
		for(int j=3;j<=no;j++){
			int count=0;
			for(int i=2;i<=j;i++){
				
				if(j%i==0){
					count++;
				}
			}
			 
			if(count ==1){
				
				System.out.print(j+",");
				a++;
				if(a%2==0){
					System.out.println("\t");
				}
			} 
		}
		
	}
}