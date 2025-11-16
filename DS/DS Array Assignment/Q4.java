/*
Q4. A peak element is greater than or equal to its neighbors. 
Given an array, find the index of any one peak element using binary search.

Example:
Input: arr = [1,3,20,4,1,0]
Output: 2 (20 is a peak)
*/

import java.util.*;
public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the values in Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

				
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                (mid == size - 1 || arr[mid] >= arr[mid + 1])) {
                System.out.println("Peak element index: " + mid);
                System.out.println("Peak element value: " + arr[mid]);
                break;
            }
            // If left neighbor is greater → move left
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // Else move right
            else {
                left = mid + 1;
            }
        }
    }
}
