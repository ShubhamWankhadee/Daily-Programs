/*
Q47. Write a Java program to check whether a given number is a Krishnamurthy Number and list all Krishnamurthy numbers up to n.
A Krishnamurthy number is a number whose sum of the factorials of its digits equals the number itself.
Example: 145 → 1! + 4! + 5! = 145.
Explanation:
 Use loops :
Outer loop for numbers from 1 to n.
Inner loop to extract digits and compute each digit’s factorial with another nested loop.
Sum 

*/


import java.util.*;
public class Q47{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		int temp=no,temp1=no;
		int sum =0,add =0;
		
		int count =0;
		while(temp>0){
			int a = temp%10;
			count++;
			temp = temp/10;
		}
		/*
		while(temp1>0){
			int rem = temp1%10;
			  sum =rem;
			  int b = rem-1;
			  while(sum>1){
				  sum = sum*b;
				  b--;
			  }
			add= add+sum;
			temp1 = temp1/10;
			
		}*/
		while(temp1 > 0){
	int rem = temp1 % 10;

	int fact = 1;
	int b = rem;
	while(b > 1){
		fact = fact * b;
		b--;
	}

	add = add + fact;
	temp1 = temp1 / 10;
	}

if(add == no){
	System.out.println(no + " is a Strong no");
}else{
	System.out.println(no + " is NOT a Strong no");
}

		System.out.println("Strong no :"+add);			
	}
}