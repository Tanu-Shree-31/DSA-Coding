import java.util.HashMap;
import java.util.Scanner;

/*
You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

Note : If no such substring exists, return -1.

Examples:

Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.
Input: s = "aabaaab", k = 2
Output: 7
Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
 */
public class LongestSubstringWithKUniques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(longestSubstringWithKUniques(s,k));
    }

    private static int longestSubstringWithKUniques(String s, int k) {
        int l =0,r=0,maxlen=-1,n=s.length();
        HashMap<Character,Integer> mpp = new HashMap<>();
        while(r<n)
        {
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r),0)+1);
            while(mpp.size()>k)
            {
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
                if(mpp.get(s.charAt(l))==0){
                    mpp.remove(s.charAt(l));
                }
                l++;
            }
            if(mpp.size()==k){
                maxlen = Math.max(maxlen, r-l+1);
            }
            r++;
        }
        return maxlen;
    }


}
