/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.



    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]


    Constraints:

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.


    Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */


package Medium;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res[] = twoSum(arr, target);
        for(int i=0; i<res.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int moreNeeded = target - num;
            if(mpp.containsKey(moreNeeded)) {
                ans[0] = i;
                ans[1] = mpp.get(moreNeeded);
                return ans;
            }
            mpp.put(num,i);
        }
        return ans;
    }
}
