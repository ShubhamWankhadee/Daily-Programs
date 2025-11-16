// Q6. Write a java program to find the sum of all natural numbers between 1 to n.


public class Q6{
	static void SumNatu(int no){
		for(int i=1;i<=no;i++){
			int sum +=i;
			
		}
		System.out.println("Sum of Natural no is: "+sum);
	
	}
	
	
	public static void main(String args[]){
		SumNatu(5);
	}
	 
}