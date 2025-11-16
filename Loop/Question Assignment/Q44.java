/*
Q44. Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
Explanation:
 Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them. 
 Compare sum with the number.
*/


import java.util.*;
public class Q44{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		 
			for(int j=1;j<=no;j++){
				boolean flag = false;
				int temp =j;
				int sum =0;
				for(int i =1;i<=temp/2;i++){
					if(temp%i==0){
						sum = sum+i;
					}
					
					
					
				}
				if(sum>temp){
				 
					 System.out.println("No is Abundant :"+temp);
				}
			}
	}
}

/*
	int no = sc.nextInt();
		int sum =0;
		for(int i =1;i<=no;i++){
			if(no%i==0){
				sum = sum+i;
			}
			
			
		}
			if(sum>no){
				System.out.println("No is Abundant");
			}else{
				System.out.println("No is not Abundant");
			}
		
*/