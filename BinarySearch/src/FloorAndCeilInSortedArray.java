import java.util.Scanner;

/*
Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.
 */
public class FloorAndCeilInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(floorAndCeil(arr, x).toString());
    }

    private static int[] floorAndCeil(int[] arr, int x) {
        int res[]= new int[2];
        int floorAns =-1,ceilAns=-1,low=0,high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                floorAns = arr[mid];
                ceilAns = arr[mid];
            } else if(arr[mid]<x){
                floorAns = arr[mid];
                low=mid+1;
            } else {
                ceilAns=arr[mid];
                high=mid-1;
            }
        }
        res[0]=floorAns;
        res[1]=ceilAns;
        return res;
    }
}
