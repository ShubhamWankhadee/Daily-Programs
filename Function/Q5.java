// Q5. Write a java program to print all odd numbers between 1 to 100.

public class Q5{
	    void Odd(int no){
		for(int i=1;i<=100;i++){
			if(i%2 !=0){
				System.out.print(" "+i );
				}
		}
	
	}
	 
	public   void main(String args[]){
		Q5 obj = new Q5();
		obj.Odd(100);
	}
}