/*
Q43. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and calculate the digit raised to its position power using 
 only loops (no Math.pow()).
 Check if the sum equals the original numbe

*/

import java.util.*;
public class Q43{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int no = sc.nextInt();
		
			for(int i=1;i<=no;i++){	
				int temp1 =i;
				int ori = temp1;
				int temp = temp1;
				int count=0,sum=0;
				while(temp>0){
					int a = temp%10;
					count++;
					temp = temp/10;
				}
				int rem=0,add=0;
				while(temp1>0){
					int dno =count;
					  rem = temp1%10;
					sum =rem;
						while(dno >1){
							sum = sum*rem;				 
							dno--;				
						}
						add =add+sum;
						 count--; 			
					temp1 = temp1/10;
				}
				 boolean  flag= false;
				if(ori == add){
					flag= true;
				}else
					flag= false;
				if(flag == true){
					System.out.println("Disarium no is:"+i);
				}
			}
	}
}

/*
System.out.println("Enter the no:");
		int no = sc.nextInt();
		int ori = no;
		int temp = no;
		int count=0,sum=0;
		while(temp>0){
			int a = temp%10;
			count++;
			temp = temp/10;
		}
		int rem=0,add=0;
		while(no>0){
			int dno =count;
			  rem = no%10;
			sum =rem;
				while(dno >1){
					sum = sum*rem;				 
					dno--;				
				}
				add =add+sum;
				 count--; 			
			no = no/10;
		}
		 
		String check = (ori == add) ? "No is Disariun " : "No is not Disariun";
		System.out.println(check);

*/