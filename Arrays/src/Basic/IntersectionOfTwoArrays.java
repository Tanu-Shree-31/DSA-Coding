package Basic;/*
    Given two integer arrays nums1 and nums2, return an array of their
    intersection
    . Each element in the result must be unique and you may return the result in any order.



    Example 1:

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]
    Example 2:

    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [9,4]
    Explanation: [4,9] is also accepted.


    Constraints:

    1 <= nums1.length, nums2.length <= 1000
    0 <= nums1[i], nums2[i] <= 1000
 */

import java.util.*;

public class IntersectionOfTwoArrays {
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
        int res[] = new int[n+m];
        res = intersectionArray(a,b);
        System.out.println("Printing the intersection of two array: ");
        for(int i = 0; i< res.length; i++){
            System.out.println(res[i]);
        }
    }

    private static int[] intersectionArray(int[] nums1,int[] nums2){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                resultList.add(num);
                map.remove(num);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
