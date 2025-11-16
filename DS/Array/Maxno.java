import java.util.*;
public class Maxno{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		
		int a[] = new int[5];
		System.out.println("Enter the value of in nos:");
		
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		
		int max=0;
		for(int i =0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		System.out.println("Max no is:"+max);
	}
}