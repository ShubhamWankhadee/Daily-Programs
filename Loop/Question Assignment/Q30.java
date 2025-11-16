/*

Q30.  Write a java program to display 1 to nth Perfect Number.*/
 

import java.util.*;  
public class Q30{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	 
	  for(int j=1;j<=no;j++){
		  int sum =0;
		  for(int i=1;i<=no/2;i++){
			  
			  if(j%i ==0 &&j>i){
				  sum =sum+i;
						

			  }
			  
		  }
		  if(sum==j){
			   System.out.println("No is perfect! is:"+sum);
		  } 
	  }
	   
  }
}