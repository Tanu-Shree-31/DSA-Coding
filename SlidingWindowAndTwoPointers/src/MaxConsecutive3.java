import java.util.Scanner;

public class MaxConsecutive3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxConsecutive3(arr,k));
    }

    private static int maxConsecutive3(int[] arr, int k) {
        // Brute force
        // take all possible subarrays and find

//        int maxlen=0;
//        for(int i=0; i<arr.length; i++){
//            int zeroes =0;
//            for(int j=i; j<arr.length; j++){
//                if(arr[j]==0) {
//                    zeroes++;
//                }
//                if(zeroes<=k){
//                    maxlen = Math.max(maxlen, j-i+1);
//                } else {
//                    break;
//                }
//            }
//        }

        // optimised TC-O(N)
        int l=0, r=0, maxlen=0, zeroCounter=0;
        while(r<arr.length) {
            if(arr[r]==0){
                zeroCounter++;
            }
            while(zeroCounter>k){
                if(arr[l]==0){
                    zeroCounter--;
                }
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
    }
}
