import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = selectionSort(arr, n);
        System.out.println("Sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.print(res[i]+" ");
        }
    }

    private static int[] selectionSort(int[] arr, int n) {
        // outer loop should reach till last but one element in the array
        for(int i=0; i<n-1; i++) {
            // lets assume the minimum as the 'i' pointer because while we move through the below loop, we can find the minimum.
            int min = i;
            // to calculate the minimum of the array
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[min]) {
                    // update the minimum to 'j' pointer
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
