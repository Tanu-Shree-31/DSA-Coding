import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,0, arr.length, target));
    }

    private static int binarySearch(int[] arr, int low, int high, int target) {
        while(high>=low){
            int mid = high+low/2;
            if(arr[mid] == target) return mid;
            else if (target>arr[mid]) low = mid +1;
            else high = mid-1;
        }
        return -1;

        // recursive method
//            if(low>high){
//                return -1;
//            }
//            int mid = low+high/2;
//            if(mid==target) return mid;
//            else if(target>arr[mid]) return binarySearch(arr,mid+1, high, target);
//            else return binarySearch(arr,low,mid-1, target);
    }
}