import java.util.Scanner;

public class NNumbers {
    public static int[] addElement(int x, int arr[]){
        if(x>=1){
            arr[x-1]=x;
            addElement(x-1, arr);
        }
        return arr;
    }
    public static int[] printNos(int x) {
        int arr[] = new int[x];
        return addElement(x, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = printNos(n);
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}