// Q6. Write a java program to find the sum of all natural numbers between 1 to n.


public class c{
	static void SumNatu(int no){
		int sum =0;
		for(int i=1;i<=no;i++){
			  sum +=i;
			
		}
		System.out.println("Sum of Natural no is: "+sum);
	
	}
	
	
	public static void main(String args[]){
		SumNatu(5);
	}
	 
}