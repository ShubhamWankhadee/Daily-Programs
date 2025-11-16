/*

Q2. Write a program in java to find two elements whose sum is closest to zero
Expected Output:
The given array is [3,8, 44, 63 ,-51 ,-35 , 19, 84 ,-69 ,4 ,-46] The Pair of elements whose sum is minimum are: [44, -46]
*/
import java.util.*;
public class ClosestZero {
    public static void main(String args[]) {

        int arr[] ={3, 8, 44, 63, -51, -35, 19, 84, -69, 4, -46};
        Arrays.sort(arr);

        int sum;
        int a = arr[0], b = arr[1];   // initialize
        int min = Math.abs(arr[0] + arr[1]);  // absolute smallest sum

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                
                sum = arr[i] + arr[j];

                if(Math.abs(sum) < min){
                    min = Math.abs(sum);
                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        System.out.println("The pair whose sum is closest to zero: [" + a + ", " + b + "]");
        System.out.println("Minimum absolute sum = " + min);
    }
}
