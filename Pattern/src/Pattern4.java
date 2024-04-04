/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

 */
import java.util.Scanner;

public class Pattern4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){ //no of rows
            for(int j=1; j<=i ; j++) //no of columns
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
