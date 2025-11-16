/*

4. Count Distinct Elements in Every Window of Size K
Example:
Input: arr = [1, 2, 1, 3, 4, 2, 3], K=4
Output: [3, 4, 4, 3]

 

*/

import java.util.*;
public class Q4{
	public static void main(String []args){
		int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        int n = arr.length;

        // Loop through all windows
        for (int i = 0; i <= n - k; i++) {
            int count = 0;

            // Check distinct elements in current window
            for (int j = i; j < i + k; j++) {
                int l;
                for (l = i; l < j; l++) {
                    if (arr[j] == arr[l]) {
                        break; // duplicate found
                    }
                }

                // If no duplicate found
                if (l == j) {
                    count++;
                }
            }

            System.out.print(count + " ");
        }
	
	}

}