import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = bubbleSort(arr, n);
        System.out.println("Sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.print(res[i]+" ");
        }
    }

    private static int[] bubbleSort(int[] arr, int n) {
        for(int i=n-1; i<=1; i++) {
            int didSwap = 0;
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        return arr;
    }
}
