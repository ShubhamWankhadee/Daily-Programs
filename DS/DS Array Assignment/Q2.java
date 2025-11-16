/*

 arr = [6, 7, 1, 2, 3, 4, 5], x = 3
 Output: Found at index 4
Explanation:
In rotated arrays, one half (left or right) is always sorted.
Check which half is sorted:


If arr[left] <= arr[mid], left part is sorted.
Else, right part is sorted.


Decide which half to discard based on x.
*/

 import java.util.*;
public class Q2{
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
		System.out.println("\nEnter the target value:");
		int x = sc.nextInt();
		
		int mid,left=0,right=arr.length-1,result=-1;
		while(left<=right){
			mid = left +(right- left)/2;
			if(arr[mid] == x){
				result=mid;
				break;
			}else if(arr[left] <= arr[mid]){
				if(x<arr[mid]){
					right= mid-1;
				}else{
					left = mid+1;
				}
				
				
			}else{
				if(x<arr[mid]){
					right= mid-1;
				}else{
					left = mid+1;
				}
				
			}
		}
		
		
		if(result != -1){
			System.out.println("No found at index:"+result);
		}else{
			System.out.println("No is not found!");
		}
		
		
				
	 	 
	 
	}
}