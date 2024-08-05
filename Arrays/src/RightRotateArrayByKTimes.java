/*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



    Example 1:

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:

    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]


    Constraints:

    1 <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1
    0 <= k <= 105


    Follow up:

    Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
    Could you do it in-place with O(1) extra space?
 */

import java.util.Scanner;

public class RightRotateArrayByKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr,k);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // This ensures k is within the bounds of the array length.
        if (k == 0) return; // If k is 0, no rotation is needed.
        // reverse last k elements
        reverseArray(nums,nums.length-k, nums.length-1);
        // reverse first n-k elements
        reverseArray(nums,0,nums.length-k-1);
        // reverse whole array
        reverseArray(nums,0,nums.length-1);
    }

    private static void reverseArray(int[] nums, int start, int end) {
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
