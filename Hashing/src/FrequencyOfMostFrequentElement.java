import java.util.Arrays;
import java.util.Scanner;

/*
    The frequency of an element is the number of times it occurs in an array.

    You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

    Return the maximum possible frequency of an element after performing at most k operations.



    Example 1:

    Input: nums = [1,2,4], k = 5
    Output: 3
    Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
    4 has a frequency of 3.
    Example 2:

    Input: nums = [1,4,8,13], k = 5
    Output: 2
    Explanation: There are multiple optimal solutions:
    - Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
    - Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
    - Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
    Example 3:

    Input: nums = [3,9,6], k = 2
    Output: 1


    Constraints:

    1 <= nums.length <= 105
    1 <= nums[i] <= 105
    1 <= k <= 105
 */

public class FrequencyOfMostFrequentElement {
    public static int maxFrequency(int[] nums, int k) {
        // 1. sort the array
        Arrays.sort(nums);

        // sliding window pattern
        // initialise all the constants
        int l = 0, r = 0; // left and right pointer
        int res = 0; // max freq
        long total = 0; //total of the current window size -> as long because of given constraints

        // base condition
        /*
        we have to expand the window side only when
        nums[r]*window size <= total + k;
        */
        // right pointer should not exceed the length of the array
        while(r < nums.length) {
            total +=nums[r];

            // check for incorrect scenario
            while((long) nums[r] * (r-l+1) > total + k) {
                total -=nums[l];
                l +=1;
            }

            // if scenario is correct we proceed further
            // update the res to compare with current res, window size
            // ensures that res always holds the maximum length of any valid window found so far.
            res = Math.max(res, r-l+1);
            r +=1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(maxFrequency(arr, k));
    }
}
