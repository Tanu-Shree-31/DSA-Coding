/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */

import java.util.Scanner;

public class Pattern6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){ //no of rows
            for(int j=1; j<=i ; j++) //no of columns
                System.out.print(j+ " ");
            System.out.println();
        }
    }
}
