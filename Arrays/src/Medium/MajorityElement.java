/*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



    Example 1:

    Input: nums = [3,2,3]
    Output: 3
    Example 2:
    
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2


    Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109


    Follow-up: Could you solve the problem in linear time and in O(1) space?
 */

package Medium;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int ele = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }
}
