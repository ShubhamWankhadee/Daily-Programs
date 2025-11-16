import java.util.*;
public class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in an array");
		int a[] = new int[6];
		for(int i =0;i<a.length;i++){
			a[i] = sc.nextInt(); 
		}
		System.out.print("Even no in an Array:");
		for(int i =0;i<a.length;i++){
			if((a[i]%2) == 0){
				System.out.print(" "+a[i]);
			} 
		}
		System.out.print("\nOdd no in an Array:");
		for(int i =0;i<a.length;i++){
			if((a[i]%2) != 0){
				System.out.print(" "+a[i]);
			}
		}
	}
}