import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Problem statement
    You are given an integer ’n’.



    Your task is to return a sorted array (in increasing order) containing all the factorial numbers which are less than or equal to ‘n’.



    The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.



    Note:
    In the output, you will see the array returned by you.
    Example:
    Input: ‘n’ = 7

    Output: 1 2 6

    Explanation: Factorial numbers less than or equal to ‘7’ are ‘1’, ‘2’, and ‘6’.
    Detailed explanation ( Input/output format, Notes, Images )
    Sample Input 1:
    7
    Sample Output 1 :
    1 2 6
    Explanation Of Sample Input 1:
    Input: ‘n’ = 7

    Output: 1 2 6

    Explanation: Factorial numbers less than or equal to ‘7’ are ‘1’, ‘2’, and ‘6’.
    Sample Input 2:
    2
    Sample Output 2:
    1 2
    Explanation Of Sample Input 2:
    Input: ‘n’ = 2

    Output: 1 2

    Explanation: Factorial numbers less than or equal to ‘2’ are ‘1’ and ‘2’.
    Expected Time Complexity:
    The expected time complexity is O(m), where ‘m’ is the number of factorial numbers which are less than or equal to ‘n’.
    Expected Space Complexity:
    The expected space complexity is O(m), where ‘m’ is the number of factorial numbers which are less than or equal to ‘n’.
    Constraints:
    1 <= n <= 10^18

    Time Limit: 1-sec
 */

public class FactorialOfNNotGreaterThanN {
    public static List<Long> factorialNumbers(long n) {
        List<Long> resList = new ArrayList<>();
        generateFibonacciSeries(n, 1, 1, resList);
        return resList;
    }

    private static void generateFibonacciSeries(long n, long currentFactorial, long currentNumber, List<Long> resList) {
        /*
        currentFactorial -> factorial of a particular number
        currentNumber -> 1,2,3...n
        1. base condition -> currentFactorial should always be less than 'n'
         */
        if(currentFactorial>n){
            return;
        }
        resList.add(currentFactorial);
        generateFibonacciSeries(n,currentFactorial*(currentNumber+1), currentNumber+1, resList);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialNumbers(n));
    }
}
