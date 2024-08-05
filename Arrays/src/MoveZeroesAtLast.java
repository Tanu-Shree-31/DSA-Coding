/*
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.



    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:

    Input: nums = [0]
    Output: [0]


    Constraints:

    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1
 */

import java.util.Scanner;

public class MoveZeroesAtLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        // //O(2n)
        // int j =0;
        // int n=nums.length;
        // for(int i=0; i<n; i++){
        // if(nums[i]!=0){
        // nums[j] = nums[i];
        // j++;
        // }
        // }
        // for(int i=j; i<n; i++){
        // nums[i]=0;
        // }
        int j = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, no need to proceed
        if (j == -1) return;

        // find the next non -zero element to swap it
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j]
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}
