
 


import java.util.*;
public class Q27{
	public static void Happy(int no){
		int count=0; 
		int sum =0;
		while(no>0){
			int rem =no%10;
			  sum =sum +(rem*rem);
			  count++;
			no /=10;
		}
		if(count == 1){
			if(sum == 1 || sum == 19){
				System.out.println("NO is Happy!");
			
			}else{
			 
				System.out.println("NO is Not  Happy!");
			}
		}else{
			Happy(sum); // Recursion
		}
		

	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		Happy(no);
	}
}