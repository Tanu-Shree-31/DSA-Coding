import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FruitsInBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(fruitsInBasket(arr));
    }

    private static int fruitsInBasket(int[] arr) {
        // Brute force
//        int maxlen=0;
//        for(int i=0; i<arr.length; i++){
//            HashSet<Integer> set = new HashSet<>();
//            for(int j=i; j<arr.length; j++){
//                set.add(arr[j]);
//                if(set.size()<=2){
//                    maxlen = Math.max(maxlen, j-i+1);
//                } else {
//                    break;
//                }
//            }
//        }


        // Optimal solution - O(N)
        int n = arr.length, l=0, r=0, maxlen=0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        while(r<n){
            // Add the current fruit
            mpp.put(arr[r],mpp.getOrDefault(arr[r],0)+1);

            // Shrink window if more than 2 fruit types
            while (mpp.size() > 2) {
                mpp.put(arr[l], mpp.get(arr[l]) - 1);
                if (mpp.get(arr[l]) == 0) {
                    mpp.remove(arr[l]);
                }
                l++;
            }

            // Update max length
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;

    }
}
