import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr, 6); //O(logn)

        System.out.println("The index of number 6 is: "+index);

        int arr1[] = {10,52,2,65,13};
        Arrays.sort(arr1);
        System.out.println("Sorted array is: ");
        for(int i: arr1){
            System.out.print(i+ " ");
        }

        System.out.println();

        Arrays.fill(arr1, 45);
        System.out.println("after filling is: ");
        for(int i: arr1){
            System.out.print(i+ " ");
        }
    }
}
