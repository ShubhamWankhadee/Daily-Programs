/*
Q32. Write a java program to display 1 to nth Strong Number.
*/
import java.util.*;  
public class Q32{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	 
			int temp =no;
			int ori =temp;
			int fact =1;
			int add =0;
			
			while(temp>0){
				int rem = temp%10;
					fact = rem;
					int a =rem-1;
						while(a>0){
							fact = fact*a;
							a--;
							 
						} 
						add +=fact;
					 
				temp =temp/10;
				
			}
			if(ori == add){
				System.out.println("No is Strong");
			} else{
				System.out.println("No is Not Strong");
			}
	
  }
}