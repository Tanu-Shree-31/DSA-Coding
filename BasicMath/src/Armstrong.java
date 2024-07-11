import java.util.Scanner;
import java.lang.*;

public class Armstrong {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = String.valueOf(n).length();
        int num = n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum= (int) (sum+Math.pow(rem, digits));
            n=n/10;
        }
        if(num==sum) System.out.println(true);
        else System.out.println(false);


    }
}