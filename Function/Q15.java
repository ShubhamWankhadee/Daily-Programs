// Q15. Write a java program to print all ASCII characters with their values.

public class Q15{

	static void Natural(int no){
		System.out.println("Natural no is: ");
		 for(int i=33;i<=126;i++){
			System.out.println( (char)i+" "+i);
		 }
    }
		 
    public static void main(String[] args) {
         
		 Natural(10);
 
    }
}

