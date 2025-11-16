/*
Q31. Write a java program to display 1 to nth Duck Number.
*/
import java.util.*;  
public class Q31{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	int rem;
	for(int i=9;i<=no;i++){
		int temp =i;
		boolean flag=false;
		while(temp>0){
			  rem =temp%10;
			if(rem ==0){
				 flag= true;
				break;
			}
			temp = temp/10;
			
		}
		if( flag == true)
			System.out.println("Duck no is:"+i);
	}
	   
  }
}