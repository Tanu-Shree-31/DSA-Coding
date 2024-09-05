package Easy;

import java.util.Scanner;

public class LongestSubArrayWithSumKBothPositivesAndNegatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(longestSubarrayWithSumK(arr,k));
    }

    public static int longestSubarrayWithSumK(int []arr, long k) {
        int n = arr.length;
        int left = 0, right = 0;
        long sum = 0;
        int maxLen = 0;

        while (right < n) {
            // Add current element to the sum
            sum += arr[right];

            // Shrink the window from the left until the sum is less than or equal to k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Check if the current sum equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move the right pointer forward
            right++;
        }

        return maxLen;

    }
}
