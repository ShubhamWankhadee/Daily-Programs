/*
10. Find All Pairs with Given Sum
Concept: Use nested loops or two-pointer technique to check sums.
 Use Case: Match contributors, tasks, etc., that add up to a budget.
arr = [1, 5, 7, -1, 5]
Target sum (S) = 6
Example: Pairs with sum 6:
(5, 1)
(-1, 7)
(5, 1)


*/

public class Pairs{
	public static void main(String args[]){
		
		int arr[] = {1, 5, 7, -1, 5};
		 
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == 6){
					System.out.println("("+arr[i]+" , "+arr[j]+") ");
				}
			}
		}
		 
	}
}