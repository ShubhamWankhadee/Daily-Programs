import java.util.*;
public class BinarySearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter the values in array:");
		for(int i=0;i<arr.length;i++){
		  arr[i] = sc.nextInt();
		}
		System.out.println("Original Array print:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		// enter the target value
		System.out.println("\nEnter the target value:");
		int tar = sc.nextInt();
		
		// ================================================
		 
			int index = -1 ,left=0,right=arr.length-1;
			while(left<right){
				  
				int mid = left+(right -left)/2;
				// if tar is match in mid then return index
				if(mid == tar){
					index =mid;
					break;
				}else if(mid < tar){
					left =mid+1;
					
				}else if(mid > tar){
					right = right-1;
				}
			}
			
			if(index == -1){
				System.out.println("\nNo is Not found");
			}else{
				System.out.println("No is found");
			}
			
		
				
	 	 
	 
	}
}