/*
6. Insert an Element at a Specific Position
Concept: Shift elements from the target index to the right and place the new value.
 Use Case: Insert student records, product, etc.
Input: arr = [10, 20, 30, 40, 50]
Size = 5
Array after insertion: [10, 20, 25, 30, 40, 50]

*/
	
import java.util.*;
public class Insert{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Element in Array: ");
		for(int i=0;i<arr.length-1;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Position & Value where Enter:");
		int pos = sc.nextInt();
		int val = sc.nextInt();
		
		System.out.println("Print Original Array !");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(" "+arr[i]);
		}	
		
		for(int i=arr.length-1;i>0;i--){
			if(i == pos){
				arr[i] = val;
				break;
			}else{
				arr[i] = arr[i-1];
			}
		}	
		System.out.println("\nPrint Perform Operation Array !");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}			
	}
}