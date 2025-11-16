// Q7. Write a java program to find the sum of all even numbers between 1 to n.


public class Q7{

	static void Natural(int no){
		 
		int sum = 0;
		 for(int i=1;i<=100;i++){
			if(i%2 ==0){
				sum +=i;
			}
			
		 }
		 System.out.print(" Sum of Even no is: "+sum);
    }
		 
    public static void main(String[] args) {
         
		 Natural(10);
 
    }
}