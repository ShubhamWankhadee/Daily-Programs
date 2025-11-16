import java.util.*;
public class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size = sc.nextInt();
		System.out.println("Enter the values of an no:");
		
		int a[] = new int[size];
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt(); 
		}
		System.out.println("Array print is:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}