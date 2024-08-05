/*
    Problem statement
    Given two sorted arrays, ‘a’ and ‘b’, of size ‘n’ and ‘m’, respectively, return the union of the arrays.



    The union of two sorted arrays can be defined as an array consisting of the common and the distinct elements of the two arrays. The final array should be sorted in ascending order.



    Note: 'a' and 'b' may contain duplicate elements, but the union array must contain unique elements.



    Example:
    Input: ‘n’ = 5 ‘m’ = 3
    ‘a’ = [1, 2, 3, 4, 6]
    ‘b’ = [2, 3, 5]

    Output: [1, 2, 3, 4, 5, 6]

    Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
    Distinct elements in ‘a’ are: [1, 4, 6]
    Distinct elements in ‘b’ are: [5]
    Union of ‘a’ and ‘b’ is: [1, 2, 3, 4, 5, 6]
    Detailed explanation ( Input/output format, Notes, Images )
    Sample Input 1 :
    5 3
    1 2 3 4 6
    2 3 5
    Sample Output 1 :
    1 2 3 4 5 6
    Explanation Of Sample Input 1 :
    Input: ‘n’ = 5 ‘m’ = 3
    ‘a’ = [1, 2, 3, 4, 6]
    ‘b’ = [2, 3, 5]

    Output: [1, 2, 3, 4, 5, 6]

    Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
    Distinct elements in ‘a’ are: [1, 4, 6]
    Distinct elements in ‘b’ are: [5]
    Union of ‘a’ and ‘b’ is: [1, 2, 3, 4, 5, 6]
    Sample Input 2:
    4 3
    1 2 3 3
    2 2 4
    Sample Output 2:
    1 2 3 4
    Explanation Of Sample Input 2 :
    Input: ‘n’ = 5 ‘m’ = 3
    ‘a’ = [1, 2, 3, 3]
    ‘b’ = [2, 2, 4]

    Output: [1, 2, 3, 4]

    Explanation: Common elements in ‘a’ and ‘b’ are: [2]
    Distinct elements in ‘a’ are: [1, 3]
    Distinct elements in ‘b’ are: [4]
    Union of ‘a’ and ‘b’ is: [1, 2, 3, 4]
    Expected Time Complexity:
    O(( N + M )), where 'N' and ‘M’ are the sizes of Array ‘A’ and ‘B’.
    Constraints :
    1 <= 'n', 'm' <= 10^5
    -10^9 <= 'a'[i], 'b'[i] <= 10^9

    Time Limit: 1 sec
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++) {
            b[i] = sc.nextInt();
        }
        List<Integer> result = sortedArray(a,b);
        System.out.println("Printing the union of two array: ");
        for(int it: result){
            System.out.println(it);
        }
    }

    public static List< Integer > sortedArray(int []a, int []b) {
        int i = 0, j = 0;
        int n = a.length, m = b.length;
        ArrayList<Integer> union = new ArrayList<>();
        while(i<n && j<m) {
            //case 1
            if(a[i]<=b[j]){
                if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            } else {
                // case 3
                if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i<n){
            // if any element left in 'a' array
            if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
            }
            i++;
        }
        while(j<m){
            // if any element left in 'b' array
            if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
}
