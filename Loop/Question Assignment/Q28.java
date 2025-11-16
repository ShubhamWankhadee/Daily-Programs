/*

Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8
*/


import java.util.*;  
public class Q28{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	int ori = no;
	int sum=0;
	int product=1;
	
	
	while(no>0){
		int digit = no%10;
		sum +=digit;
		  no= no/10;
	}
	 
	while(ori>0){
		
		int digit1 = ori%10;
		product *=digit1;
		  ori = ori/10;
		   
	}

	if(sum == product){
		
		System.out.println("No is Spy");
	}else{
		System.out.println("No is not Spy");
	}
  }
  
}