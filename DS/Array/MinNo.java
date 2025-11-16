import java.util.*;
  class MinNo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in an Array:");
		
		int a[]= new int[5];
		for(  int i =0;i<a.length ;i++){
			a[i] = sc.nextInt();
			
		}
		int min =a[0]; // for the to check min no
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min =a[i];
			}
		}
		System.out.println("Small no is:"+min);
	}
}