/*Problem statement
The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

    F(n) = F(n - 1) + F(n - 2), 
    Where, F(1) = 1, F(2) = 1


Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.

"Indexing is start from 1"*/

import java.util.*;

class fibonacci_series {

    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        fibonacci_series ob2 = new fibonacci_series();

        System.out.println("enter the nth element position you want to find in the series:");
        int pos = ob1.nextInt();
        ob2.position(pos);
        ob1.close();
    }

    void position(int pos) {
        int firstNum = 0, secondNum = 1, nexnum = 0, hold = 0;
        for (int i = 1; i <= pos; i++) {
            System.out.print(firstNum + ", ");
            nexnum = firstNum + secondNum;
            hold = firstNum;
            firstNum = secondNum;
            secondNum = nexnum;
        }
        System.out.println();
        System.out.println(pos + " element is:" + hold);
    }
}
