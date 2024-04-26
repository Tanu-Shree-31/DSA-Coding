import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){ //no of rows
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");//spaces
            }
            for(int k=0; k<2*i+1; k++){ //stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


