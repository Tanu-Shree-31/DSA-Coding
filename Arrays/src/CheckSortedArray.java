/*
    Problem statement
    You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.



    Your task is to return 1 if the given array is sorted. Else, return 0.



    Example :
    Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
    Output: 1

    The given array is sorted in non-decreasing order; hence the answer will be 1.
    Detailed explanation ( Input/output format, Notes, Images )
    Sample Input 1 :
    4
    0 0 0 1
    Sample Output 1 :
    1
    Explanation For Sample Input 1 :
    The given array is sorted in non-decreasing order; hence the answer will be 1.
    Sample Input 2 :
    5
    4 5 4 4 4
    Sample Output 2 :
    0
    Expected Time Complexity:
    O(n), Where ‘n’ is the size of an input array ‘a’.
    Constraints:
    1 ≤ 'n' ≤ 5*10^6
    0 ≤ 'a'[i] ≤ 10^9

    Time limit: 1 sec
 */


import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The result is: "+checkSorted(n, arr));
    }

    private static int checkSorted(int n, int[] arr) {
        int res = 1;
        for(int i=0; i<=n-2; i++){
            if(arr[i]>arr[i+1]){
                res = 0;
                break;
            }
        }
        return res;
    }
}
