import java.util.*;
public class Q4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in an Array");
		int a[] = new int[6];
		
		for(int i=0;i<a.length;i++){
			a[i] =  sc.nextInt();
		}
		
		System.out.print("Even no index is:");
		for(int i =0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.print(i+" ");
			}
		}
		
		System.out.print("\nOdd no index is:");
		for(int i =0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.print(i+" ");
			}
		}
	}
}