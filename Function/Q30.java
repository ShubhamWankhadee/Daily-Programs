/*
Q30.  Write a java program to display 1 to nth Perfect Number.

*/

import java.util.*;
public class Q30{
	public static void Perfect(int no){
		int store=0;
		for(int i=1;i<=no/2;i++){
			if(no%i==0){
				store +=i;
			}
			 
		}
		
		if(no == store){
			System.out.println("No is Perfect");
			
		}else{
			System.out.println("No is not Perfect");
		}
		

	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		Perfect(no);
	}
}