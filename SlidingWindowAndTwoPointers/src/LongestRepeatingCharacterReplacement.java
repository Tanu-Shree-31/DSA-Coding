import java.util.Scanner;
/*
424. Longest Repeating Character Replacement
Solved
Medium
Topics
premium lock icon
Companies
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.



Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
 */
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(longestRepeatingCharacterReplacement(s,k));
    }

    private static int longestRepeatingCharacterReplacement(String s, int k) {
        // s = "AABABBA"
        // brute force
//        int maxlen=0, maxfreq=0,changes=0;
//        int n=s.length();
//        for(int i=0; i<n; i++) {
//            int hash[] = new int[26];
//            for(int j=i; j<n; j++){
//                hash[s.charAt(j)='A']++;
//                maxfreq=Math.max(maxfreq,hash[s.charAt(j)-'A');
//                changes = j-i+1 - maxfreq;
//                if(changes>k){
//                    break;
//                } else {
//                    maxlen=Math.max(j-i+1,maxlen);
//                }
//            }
//        }
//        return maxlen;


        // optimised approach
        int l=0,r=0,maxlen=0, maxfreq=0;
        int n=s.length();
        int hash[] = new int[26];
        while(r<n){
            hash[s.charAt(r)-'A']++;
            maxfreq= Math.max(maxfreq,hash[s.charAt(r)-'A']);
            if(r-l+1 - maxfreq>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;

    }
}
