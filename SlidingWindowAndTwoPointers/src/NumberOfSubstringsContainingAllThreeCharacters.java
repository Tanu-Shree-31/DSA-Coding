import java.util.Scanner;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(numberOfSubstringsContainingAllThreeCharacters(s));

    }

    private static int numberOfSubstringsContainingAllThreeCharacters(String s) {
        int count = 0, n = s.length();
        // Brute force approach
//        for(int i=0; i<n; i++) {
//            int hash[] = new int[3];
//            for(int j=i; j<n; j++){
//                hash[s.charAt(j)-'a']=1;
//                if(hash[0] + hash[1] + hash[2] == 3){
//                    count = count+1; //here once we have found out the valid 1st substring,
//                    // all other characters in the whole string will also be considered
//                    // thus we can use n-j
//                    // count = count + (n-j);
//                    // TC: O(N2); SC: O(3)
//                }
//            }
//        }

        // Optimised approach
        int lastSeen[] = {-1,-1,-1};
        for(int i=0; i<n; i++){
            lastSeen[s.charAt(i)-'a'] = i; //the array holds the last seen index
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                count = count + (1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2])));
            }
        }
        return count;
    }
}
