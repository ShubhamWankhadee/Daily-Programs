/*

Q29. Write a java program to display 1 to nth Prime Number.
*/


import java.util.*;  
public class Q29{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	 
	for(int i=2;i<=no;i++){
		int count =0;
		 for(int j =1 ;j<=no;j++){
			 
			 if(i%j==0 ){
				 count++;
				  
			 }
			 
		 }
		 if(count ==2){
			 System.out.println("Prime no:"+i);
		 
		 }
		 
	}
	
  }
  
}