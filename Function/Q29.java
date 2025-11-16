/*
Q29. Write a java program to display 1 to nth Prime Number.

*/



import java.util.*;
public class Q29{
	public static void Prime(int no){
	
		 for(int i=2;i<=no;i++){
			boolean flag = true;
			for(int j=2;j<=i/2;j++){
			
				if(i%j==0){
					flag = false;
				}
			}
			if(flag){
				System.out.println(" "+i);
			}
			
		 
		 }

	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		Prime(no);
	}
}