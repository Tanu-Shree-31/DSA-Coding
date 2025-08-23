import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
Given a string s, find the length of the longest substring without duplicate characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutAnyRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestSubstringWithoutAnyRepeatingCharacter(s));
    }

    private static int longestSubstringWithoutAnyRepeatingCharacter(String s) {
        // brute force
//        int len = 0, maxlen =0;
//        for(int i=0; i<s.length(); i++){
//            HashSet<Character> set = new HashSet<>();
//            for(int j=i; j<s.length(); j++){
//                if(set.contains(s.charAt(j))){
//                    maxlen = Math.max(maxlen,j-i);
//                    break;
//                }
//                set.add(s.charAt(j));
//            }
//            return maxlen;
//        }

        // optimal approach
        int l = 0, r=0, maxlen=0;
        int n = s.length();
        HashMap<Character,Integer> mpp = new HashMap<>();
        while (r < n) {
            if (mpp.containsKey(s.charAt(r))) {
                // Move l to one position after last occurrence of ch
                l = Math.max(l, mpp.get(s.charAt(r)) + 1);
            }
            mpp.put(s.charAt(r), r); // update last seen index
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}
