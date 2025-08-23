import java.util.Scanner;

/*
1248. Count Number of Nice Subarrays
Medium
Topics
premium lock icon
Companies
Hint
Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.



Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Example 2:

Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.
Example 3:

Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16
 */
public class CountNumberOfNiceSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(countNumberOfNiceSubarrays(arr,k));
    }

    public static int countNumberOfNiceSubarrays(int[] arr, int k) {
        return helperMethod(arr, k) - helperMethod(arr, k - 1);
    }

    private static int helperMethod(int[] arr, int k) {
        int l=0,r=0,counter=0,count=0;
        while(r<arr.length) {
            if(arr[r]%2!=0) {
                counter++;
            }
            while(counter>k){ //shrink the window until the window is valid, which means when the number is odd
                if(arr[l]%2!=0){
                    counter--;
                }
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}
