/*
Q33. Write a java program to display 1 to nth Armstrong Number.
*/

import java.util.*;  
public class Q33{
  public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	int no = sc.nextInt();
	for(int i=1;i<=no;i++){
			int ori=i;
			int temp = i;
			int count=0,sum=0,add=0;
			while(temp>0){
				int rem = temp%10;
				count++;
				temp = temp/10;
				
			}
			while(ori>0){
				int a= count-1;
				int rem1 = ori%10;
				sum= rem1;
					while(a>0){
						  sum= sum*rem1;
						a--;
					}
					 
					  add+=sum;
				ori =ori/10;
			}
			if(i == add && i>10){
				System.out.println("Amstrong no is:"+i);
			}
	}
	
  }
}

/*
int ori=no;
			int temp = no;
			int count=0,sum=0,add=0;
			while(temp>0){
				int rem = temp%10;
				count++;
				temp = temp/10;
				
			}
			while(ori>0){
				int a= count-1;
				int rem1 = ori%10;
				sum= rem1;
					while(a>0){
						  sum= sum*rem1;
						a--;
					}
					 
					  add+=sum;
				ori =ori/10;
			}
			if(no == add){
				System.out.println("No is Amstrong");
			}else{
				System.out.println("No is not Amstrong");
			}
*/