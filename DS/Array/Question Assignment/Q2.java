import java.util.*;
public class Q2{
	public static void main(String argss[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of an Arrays:");
		int a[]= new int[5];
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		int sum =0;
		
		for(int i=0;i<a.length;i++){
			sum +=a[i];
		}
		System.out.println("Sum of Arrays digit is:"+sum);
	}
}