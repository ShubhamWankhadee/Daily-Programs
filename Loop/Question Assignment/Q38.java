/*
Q38. Write a java program to find all prime factors of a number.
*/

import java.util.*;  
public class Q38{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	for(int i=2;i<=no;i++){
		if(no%i==0){
			System.out.println("diviser:"+i);
			int count =0;
			for(int j=2;j<=i;j++){
				
				if(i%j==0){
					count++;
				}
			}
			if(count == 1){
				System.out.println("No is all prime factors:"+i);
			}
			
		}
	}

	
	
  }
}