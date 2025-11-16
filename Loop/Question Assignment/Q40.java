/*
Q40. Write a Java program to print all automorphic numbers between 1 and n. 
An automorphic number’s square ends with the number itself (e.g., 5² = 25).
 Explanation:
 Use loop to check square and a while loop to match last digits.
*/

import java.util.*;  
public class Q40{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two nos:");
	int no = sc.nextInt();
	int temp=no;
	int sq= no*no;
	int count=0;
	boolean flag = false;
	while(no>0){
		int r = no%10;
			count++;
		no =no/10;
	}
		while(temp>0){
			int rem=temp%10;
				while(sq>0){
					int rem1= sq%10;
					if(count>0){
						if(rem == rem1){
							flag= true;
						}
						if(flag){
							break;
						}
					}
						
					  sq = sq/10;
				}
				
			  temp =temp/10;
		}
						if(flag){
							System.out.println("No is Automorphic");
						}else{
							System.out.println("No is not Automorphic");
						}
		
		
	
  }
}