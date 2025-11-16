//Q8. Write a java program to find the sum of all odd numbers between 1 to n.


public class Loop8{
	public static void main(String args[]){
		int sum =0;
		for(int i =1;i<=100;i++){
			if(i%2!=0)
			sum = sum+i;
				
			
		}System.out.println(sum);
	}
}