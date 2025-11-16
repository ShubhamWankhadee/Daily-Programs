// Q5. Write a java program to print all odd numbers between 1 to 100.

public class Loop5{
	public static void main(String args[]){
		for(int i =1;i<=100;i++){
			if(i%2 != 0){
				System.out.println(i);
			}
		}
	}
}