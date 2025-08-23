import java.util.Scanner;

public class FirstAndLastOccuranceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstAndLastOccurance(arr,x));
    }

    private static int[] firstAndLastOccurance(int[] arr, int x) {
        int first = firstOccurance(arr, x);
        if(first==-1){
            return new int[]{-1, -1};
        }
        int last = lastOccurance(arr, x);
        return new int[]{first, last};
    }

    private static int lastOccurance(int[] arr, int x) {
        int low=0, high=arr.length-1, last=-1;
        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            } else if(arr[mid]<x){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return last;
    }

    private static int firstOccurance(int[] arr, int x) {
        int low=0,high= arr.length-1, first=-1;
        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            } else if(arr[mid]<x){
                low=mid+1;
            } else{
                high = mid-1;
            }
        }
        return first;
    }


    /*
    another approach is use lowerBound - upperBound-1, because
    lowerbound is <=x
    upperbound is >x
     */
}
