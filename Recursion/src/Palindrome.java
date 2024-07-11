import java.util.Scanner;

/*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    
    Given a string s, return true if it is a palindrome, or false otherwise.



    Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    Example 2:

    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
    Example 3:

    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.


    Constraints:

    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.
 */

public class Palindrome {
    public static boolean isPalindrome(String str) {
        boolean res = false;
        res = checkCharacters(0,str.length()-1,str.toLowerCase());
        return res;
    }

    private static boolean checkCharacters(int left, int right, String str) {
        //base case when both pointers
        if(left>=right) {
            return true;
        }

        if(!Character.isLetterOrDigit(str.charAt(left))) {
            return checkCharacters(left+1, right, str);
        }

        if(!Character.isLetterOrDigit(str.charAt(right))) {
            return checkCharacters(left, right-1, str);
        }

        if(str.charAt(left)!=str.charAt(right)) {
            return false;
        }

        return checkCharacters(left+1, right-1, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
