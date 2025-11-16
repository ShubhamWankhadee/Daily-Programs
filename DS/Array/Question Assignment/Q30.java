/*
Q5. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5


Explanation:


Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.


Therefore, the first repeating element is 5.
*/



import java.util.*;
public class Q30{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		 
		System.out.println("Enter the values in Array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		/*
		// old logic
			for(int i =0;i<=arr.length;i++){
				if(arr[i] == arr[arr.length-1-i]){
					System.out.println("first time: "+arr[i]);
					break;
				}
			}
			*/
		boolean flag = false;
		for(int j=0;j<arr.length;j++){
			for(int i =j+1;i<arr.length;i++){
				if(arr[j] == arr[i]){
					 
					flag = true;
					break;
					
				}
			}
			if(flag){
				System.out.println("first time: "+arr[j]);
				break;
			}else{
				System.out.println("In the array no anywhere dublicate no!");
				break;
			}
		}
	}
}