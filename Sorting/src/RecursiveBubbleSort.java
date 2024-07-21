import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        recursiveBubbleSort(arr, n);
        System.out.println("Sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void recursiveBubbleSort(int[] arr, int n) {
        if(n==1){
            return;
        }
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        recursiveBubbleSort(arr, n-1);
    }
}
