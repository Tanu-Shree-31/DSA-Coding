package Easy;

import java.util.HashMap;
import java.util.Map;
/*
    Given an array arr containing n integers and an integer k. Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.



    Examples:


    Input :
    arr[] = {10, 5, 2, 7, 1, 9}, k = 15
    Output : 4
    Explanation:
    The sub-array is {5, 2, 7, 1}.
    Input :
    arr[] = {-1, 2, 3}, k = 6
    Output : 0
    Explanation:
    There is no such sub-array with sum 6.
    Expected Time Complexity: O(n).
    Expected Auxiliary Space: O(n).



    Constraints:
    1<=n<=105
    -105<=arr[i], K<=105
 */

import java.util.Scanner;

public class LongestSubArrayWithSumKOnlyPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(lenOfLongSubarr(arr,k,n));
    }

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for(int i=0; i<n ; i++){
            // calculate the prefix sum till the index.
            sum = sum + arr[i];

            // if sum==k, update the maxLen
            if(sum==k){
                maxLen = Math.max(maxLen,i+1);
            }

            // calculate the sum of remaining part i.e. x-k;
            long rem = sum - k;

            // calculate the length and update the maxLen
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }

            // finally update the map checking the conditions
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
    }
}
