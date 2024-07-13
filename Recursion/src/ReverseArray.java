import java.util.Scanner;

/*
    Problem statement
    Given an array 'arr' of size 'n'.

    Return an array with all the elements placed in reverse order.

    Note:
    You don’t need to print anything. Just implement the given function.
    Example:
    Input: n = 6, arr = [5, 7, 8, 1, 6, 3]

    Output: [3, 6, 1, 8, 7, 5]

    Explanation: After reversing the array, it looks like this [3, 6, 1, 8, 7, 5].
    Detailed explanation ( Input/output format, Notes, Images )
    Sample Input 1:
    8
    3 1 1 7 4 2 6 11
    Sample Output 1:
    11 6 2 4 7 1 1 3
    Explanation Of Sample Input 1 :
    After reversing the array, it looks like this [11, 6, 2, 4, 7, 1, 1, 3].
    Sample Input 2:
    4
    8 1 3 2
    Sample Output 2:
    2 3 1 8
    Explanation Of Sample Input 2 :
    After reversing the array, it looks like this [2, 3, 1, 8].
    Expected time complexity
    The expected time complexity is O(n).
    Constraints:
    1 <= 'n' <= 10^6
    -10^9 <= 'arr[i]' <=10^9
 */

public class ReverseArray {
    public static int[] reverseArray(int n, int []nums) {
        return printReverse(nums,0,n-1);
    }

    private static int[] printReverse(int[] nums, int start, int end) {
        if (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            printReverse(nums, start+1, end-1);
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int res[] = reverseArray(n,arr);
        for(int i=0; i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
