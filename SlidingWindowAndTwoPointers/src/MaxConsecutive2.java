import java.util.Scanner;

/*
Description
Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.



Example 1:

Input: nums = [1,0,1,1,0]
Output: 4
Explanation: Flip the first zero will get the maximum number of consecutive 1s. After flipping, the maximum number of consecutive 1s is 4.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 4


Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */
public class MaxConsecutive2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxConsecutive2(arr));
    }

    private static int maxConsecutive2(int[] arr) {
        int l =0, r=0, zeroCounter =0, maxlen=0;
        while(r<arr.length) {
            if(arr[r] == 0){
                zeroCounter++;
            }
            while(zeroCounter>1){
                if(arr[l]==0){
                    zeroCounter--;
                }
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
    }
}
