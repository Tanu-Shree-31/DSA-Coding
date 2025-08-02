/*
Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

package Medium;

import java.util.Scanner;

public class MaximumProductSubarraySumUsingKadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr) {
        int max = arr[0];
        int prod = 1;
        int n=arr.length;
        for(int i=0; i<n; i++){
            prod=prod*arr[i];
            if(prod<0){
                prod=0;
            }
            if(prod>max){
                max = prod;
            }
        }
        // if the array has empty subarray
        //uncomment below lines
        // if(max<0){
        //     max=0;
        // }
        return max;
    }
}
