import java.util.Scanner;

public class NumberArrayHashing {
    public static void main(String[] args) {
        // assumption is that the max element which we enter the main array is 6.
        // we will have the hash array of 12 size.
        Scanner sc = new Scanner(System.in);

        // input the elements of the main array
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        // pre-compute
        int hash[] = new int[12];
        for(int i=0; i<n; i++){
            hash[arr[i]] = hash[arr[i]] + 1;
        }

        int freq = sc.nextInt();
        while (freq-- !=0){
            int num = sc.nextInt();
            // fetching
            System.out.println(hash[num]);
        }
    }
}
