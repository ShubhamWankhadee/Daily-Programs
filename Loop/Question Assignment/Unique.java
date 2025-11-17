/*
Input: {1,2,2,3,4,4,5}
Output: 1, 3, 5
*/

public class Unique{
	public static void main(String args[]){
		int arr[] = {1,2,2,3,4,4,5};									// D:\Core java Giris Tech										
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j] && i != j){
					arr[j]=-1;
					arr[i]=-1;
				} 
			}
			if(arr[i] != -1)
				System.out.print(" "+arr[i]);
			
		}
	}
}