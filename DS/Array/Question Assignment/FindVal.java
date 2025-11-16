// Find Value

import java.util.*;
public class FindVal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i;
		int a[] = new int[10];
		int kser = -1;
		System.out.println("Enter the value in Array:");
		
		for(i =0;i<a.length;i++){
			a[i] = sc.nextInt();
			
		}
		System.out.println("Enter target Value:");
		int target = sc.nextInt();
		
		for(i=0;i<a.length;i++){
			if(a[i] == target){
				kser = a[i];
			}
		}
		if(kser != -1){
			System.out.println("No is found");
		}else{
			System.out.println("No is not found");
		}
	}
}