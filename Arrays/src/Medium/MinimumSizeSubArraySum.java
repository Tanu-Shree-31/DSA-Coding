package Medium;

import java.util.Scanner;

/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.



Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 */

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int target, int[] arr) {
        int size = Integer.MAX_VALUE, sum = 0;
        int i = 0;

        for (int j = 0; j < arr.length; j++) { // End pointer
            sum += arr[j];

            // Shrink the window until the sum is less than the target
            while (sum >= target) {
                size = Math.min(size, j - i + 1);
                sum -= arr[i];
                i++;
            }
        }

        return size == Integer.MAX_VALUE ? 0 : size;
    }
}
