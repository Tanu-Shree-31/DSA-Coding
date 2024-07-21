import java.util.Scanner;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        recursiveInsertionSort(arr, n, 0);
        System.out.println("Sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void recursiveInsertionSort(int[] arr, int n, int i) {
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursiveInsertionSort(arr, n,i+1);
    }
}
