/*

Q9. You are given a large integer represented as an integer array digits, 
where each digits[i] is the ith digit of the integer. The digits are ordered from most
 significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. 

Example 1: 
Input: digits = [1,2,3]    
Output: [1,2,4] 
Explanation: The array represents the integer 123. 
Incrementing by one gives 123 + 1 = 124. 
Thus, the result should be [1,2,4]. 

Example 2: 
Input: digits = [4,3,2,1]   
Output: [4,3,2,2] 
Explanation: The array represents the integer 4321. 
Incrementing by one gives 4321 + 1 = 4322. 
Thus, the result should be [4,3,2,2]. 

*/


import java.util.*;
public class Q43{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter the values in array:");
		for(int i=0;i<arr.length;i++){
		  arr[i] = sc.nextInt();
		}
		System.out.println("Original Array print:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		 
		 System.out.println("\nEnter which digit to add in Array: ");
			int dig = sc.nextInt();
		 System.out.println("\nAfter perform op :");
		 
		 int sum=0;
		 for(int i=0;i<arr.length;i++){
		   sum= sum*10+arr[i];
		 }
	     // digit count
		 sum = sum+dig;
		 int asum = sum;
		 int count=0;
		 while(asum>0){
			 count++;
			 asum/=10;
		 }
		 int print[] = new int[count];
		 int k=count-1;
			 while(sum>0){
				 print[k] = sum%10;
				 sum = sum/10;
				 k--;
			 }
		 
		 
		 for(int i=0;i<print.length;i++){
			 System.out.print("  "+print[i]);
		 }
		 
		
 
 
	}
}
