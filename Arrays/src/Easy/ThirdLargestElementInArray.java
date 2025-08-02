package Easy;

import java.util.Scanner;

public class ThirdLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The result is: "+thirdLargestElement(arr));
    }

    private static Integer thirdLargestElement(int[] arr) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : arr) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) {
                continue;
            }
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}
