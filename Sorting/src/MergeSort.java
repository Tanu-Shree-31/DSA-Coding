import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0, n-1);
        System.out.println("Sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l >= r){
            return;
        } else {
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = l; // starting index of left half of arr
        int right = mid+1; // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner
        while(left<=mid && right<=r) {
            if(arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add((arr[right]));
                right++;
            }
        }

        // if elements on the left half are still left
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left
        while(right<=r){
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr
        for(int i=l; i<=r; i++){
            arr[i] = temp.get(i - l);
        }
    }
}
