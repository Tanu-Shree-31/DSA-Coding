import java.util.Scanner;

public class NNumbersReverse {
    public static int[] addElement(int x, int arr[]){
        if(x>0){
            arr[arr.length-x]=x;
            addElement(x-1,arr);
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
