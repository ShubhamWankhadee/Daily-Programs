//Q7. Write a java program to find the sum of all even numbers between 1 to n.

public class Loop7{
	public static void main(String args[]){
		int sum =0;
		for(int i =1;i<=100;i++){
			if(i%2==0)
			sum = sum+i;
				
			
		}System.out.println(sum);
	}
}