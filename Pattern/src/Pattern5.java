/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */
import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){ //no of rows
            for(int j=1; j<=i ; j++) //no of columns
                System.out.print("* ");
            System.out.println();
        }
    }
}
