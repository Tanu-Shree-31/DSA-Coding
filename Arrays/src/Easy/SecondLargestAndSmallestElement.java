package Easy;/*
    Problem statement
    You have been given an array ‘a’ of ‘n’ unique non-negative integers.



    Find the second largest and second smallest element from the array.



    Return the two elements (second largest and second smallest) as another array of size 2.



    Example :
    Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
    Output: [4, 2]

    The second largest element after 5 is 4, and the second smallest element after 1 is 2.
    Detailed explanation ( Input/output format, Notes, Images )
    Sample Input 1 :
    4
    3 4 5 2
    Sample Output 1 :
    4 3
    Explanation For Sample Input 1 :
    The second largest element after 5 is 4 only, and the second smallest element after 2 is 3.
    Sample Input 2 :
    5
    4 5 3 6 7
    Sample Output 2 :
    6 4
    Expected Time Complexity:
    O(n), Where ‘n’ is the size of an input array ‘a’.
    Constraints:
    2 ≤ 'n' ≤ 10^5
    0 ≤ 'a'[i] ≤ 10^9

    Time limit: 1 sec


    Hints:
    1. Sort the array.
    2. More efficiently, can you use the largest and smallest elements to find the required elements?
 */

import java.util.Scanner;

public class SecondLargestAndSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = getSecondOrderElements(n, arr);
        System.out.println("Second largest element is: "+res[0]+" Second smallest element is: "+res[1]);
    }
    public static int[] getSecondOrderElements(int n, int []arr) {
        int res [] = new int[2];
        int sLargest = secondLargest(n, arr);
        int sSmallest = secondSmallest(n, arr);
        res[0] = sLargest;
        res[1] = sSmallest;
        return res;
    }

    private static int secondSmallest(int n, int[] arr) {
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i = 1; i<n; i++) {
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i]<sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }

    private static int secondLargest(int n, int[] arr) {
        int largest = arr[0];
        int sLargest = -1;
        for(int i=1; i<n; i++){
            if(arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}
