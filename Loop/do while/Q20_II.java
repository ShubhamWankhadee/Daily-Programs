import java.util.*;
public class Q20_II{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		 int temp = sc.nextInt();
        
        int no = temp;
        int count = 0;

        
        while (no > 0) {
            no = no / 10;
            count++;
        }

        
        int sq = 1;
        for (int i = 1; i < count; i++) {
            sq = sq * 10;
        }

        int first = temp / sq;              // first digit
        int last = temp % 10;               // last digit
        int mid = (temp % sq) / 10;
		
		int swap = (last *sq) +(mid*10)+first;
		System.out.println(swap);
		 
	}
}

 
 
 
 
 
 