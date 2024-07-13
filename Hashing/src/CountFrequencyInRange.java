import java.util.Scanner;

public class CountFrequencyInRange {
    public static int[] countFrequency(int n, int x, int []nums){
        x = x+1;
        int arrHash[] = new int[x];

        //pre-computing
        for(int i=0; i<n ; i++){
            arrHash[nums[i]] = arrHash[nums[i]] +1;
        }
        return arrHash;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input the elements of the main array
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = sc.nextInt();
        int x = sc.nextInt();
        int res[] = countFrequency(n,x,nums);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
