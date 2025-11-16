import java.util.*;
public class Demo2{
	public static void main(String args[]){
		 
		Scanner sc = new Scanner(System.in);
		int x[];
		 x = new int[5];
		System.out.println("Enter the value in an Array:");
		for(int i=0;i<x.length;i++){
			  x[i] =  sc.nextInt();
			
		}
		System.out.println("Display Array Data");
		for(int i= 0;i<x.length;i++){
			System.out.println("No is:"+x[i]);
		}
	}
}