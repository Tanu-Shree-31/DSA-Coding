import java.util.Scanner;
import java.lang.*;
public class SumOfAllDivisors {
    public static int sumOfAllDivisors(int n){
//        Brute force method
//        int res=0;
//        for(int i=1; i<=n; i++){
//            int sum=0;
//            for(int j=1; j<=i; j++){
//                if(i%j==0){
//                    sum = sum+j;
//                } 
//            }
//            res = res +sum;
//        }
//        return res;

        int sum=0;
        for(int i=1; i<=n; i++){
            sum = sum + (n/i)*i;
        }
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sumOfAllDivisors(n);
        System.out.println(res);
    }
}