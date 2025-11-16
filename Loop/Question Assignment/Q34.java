/*
Q34. Write a java program to find the frequency 
		of each digit in a given integer.
*/

import java.util.*;  
public class Q34{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	 int temp =no;
	 
		while(temp>0){
			
			int ori =no;
			int rem = temp%10;
			int count=0;
				while(ori>0){
					int rem1 = ori%10;
					if(rem == rem1){
						count++;
						 
					}
					ori = ori/10;
				}if(rem == rem){
					System.out.println(rem+" is:"+count+"time");
				}
				
			temp = temp/10;
			
		}
	
  }
}