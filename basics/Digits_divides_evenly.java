/*Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 

Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.
Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
Input: n = 23
Output: 0
Explanation: 2 and 3, none of them divide 23 evenly.*/
import java.util.*;

class Solution {

    int divides_evenly(int N) {
        int original_Num = N, count = 0;

        while (N != 0) {
            int digit = N % 10;
            N = N / 10;
            if (digit != 0 && original_Num % digit == 0) {
                count++;
            }
        }
        return count;
    }
}

class Digits_divides_evenly extends Solution {

    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        Digits_divides_evenly ob2 = new Digits_divides_evenly();

        System.out.println("Enter a number :");
        int num = ob1.nextInt();
        int res = ob2.divides_evenly(num);
        System.out.println("Tolals numbers of digits from entered number which can divides itself:" + res);
    }
}
