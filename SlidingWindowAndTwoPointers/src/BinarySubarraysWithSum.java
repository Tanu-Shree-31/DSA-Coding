import java.util.Scanner;

public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int goal = sc.nextInt();
        System.out.println(binarySubarraysWithSum(arr,goal));
    }


    public static int binarySubarraysWithSum(int[] arr, int goal) {
        return helperMethod(arr, goal) - helperMethod(arr, goal - 1);
    }


    private static int helperMethod(int arr[], int goal) {
//        // brute force approach
//        int maxcount = 0;
//        for(int i=0; i<arr.length; i++){
//            int sum =0;
//            for(int j=i; j<arr.length; j++) {
//                sum = sum+arr[j];
//                if(sum==goal){
//                    maxcount++;
//                }
//            }
//        }
//        return maxcount;

        // optimised approach
        int l=0,r=0,count=0,sum=0,n=arr.length;
        while(r<n){
            sum=sum+arr[r];
            while(sum>goal){
                sum=sum-arr[l];
                l++;
            }
            count=count+(r-l+1); // this is because we are calculating the number of
            //valid substrings at a range of l...r, not incrementing the counter by 1.
            r++;
        }
        return count;
    }
}
