package Easy;/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
 */

import java.util.Scanner;

public class MissingNumberInArrayRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            xor1 = xor1 ^ i; // xor of 1 -> n-1
            xor2 = xor2 ^ nums[i]; // xor of all array elements
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }
}
