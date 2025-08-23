import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchInsertPosition(arr, arr.length, target));
    }

    private static int searchInsertPosition(int[] arr, int n, int target) {
        int low =0, high=n-1, ans=n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target){
                ans=mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}
