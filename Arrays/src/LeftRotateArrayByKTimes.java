import java.util.Scanner;

public class LeftRotateArrayByKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr,k);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate(int[] nums, int k) {
        // reverse first k elements
        reverseArray(nums,0,k-1);
        // reverse last n-k elements
        reverseArray(nums,k,nums.length-1);
        // reverse whole array
        reverseArray(nums,0,nums.length-1);
    }

    private static void reverseArray(int[] nums, int start, int end) {
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
