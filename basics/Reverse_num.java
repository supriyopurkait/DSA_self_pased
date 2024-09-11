import java.util.*;

class Solution {
    public int reverse(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            
            // Check for overflow before actually performing the addition
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }
            
            sum = sum * 10 + digit;
        }
        return sum;
    }
}

class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        
        int result = solution.reverse(num);
        
        if (result == 0) {
            System.out.println("Overflow or underflow occurred, number exceeds integer bounds.");
        } else {
            System.out.println("The reverse of the number is: " + result);
        }
        
        scanner.close();
    }
}
