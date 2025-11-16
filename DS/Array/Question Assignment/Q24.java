/*
Q4.Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.


*/

import java.util.*;
public class Q24
{
	public static void main(String args[])
	{
		  Scanner sc = new Scanner(System.in);
		  int arr[] = new int[6];
		  System.out.println("Enter the value of Array:");
		  for(int  i =0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		  }

		  
		  /*
		  int temp;
		  Arrays.sort(arr);
			  for(int i =1;i<arr.length;i++){
					if(arr[i]%2==0){
						temp = arr[i-1] ;
						arr[i-1] = arr[i];
						arr[i] = temp;
						
					}
			  }
			  
			  for(int i =0;i<arr.length;i++){
				System.out.print(" "+arr[i]);
			}
	 -------------------------------------------------------------*/
	 
	 
	     int evenIndex = 0, oddIndex = 1;
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[evenIndex] = arr[i];
                evenIndex += 2;
            } else {
                result[oddIndex] = arr[i];
                oddIndex += 2;
            }
        }
		 
			for(int i =0;i<result.length;i++){
				System.out.print(" "+result[i]);
			}
			
			
			
		  

 	}
}