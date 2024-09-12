
import java.util.*;

class Palindrom {

    boolean check(int num) {
        if (num < 0) {
            return false;
        } else {
            int sum = 0;
            while (num != 0) {
                sum = (num % 10) + (sum * 10);
                num = num / 10;

            }
            return true;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        Palindrom ob2 = new Palindrom();
        System.out.println("enter a number:");
        int num = ob1.nextInt();
        boolean val = ob2.check(num);
        if(val == true){
            System.out.println("Entered number is palindrom");
        }else{
            System.out.println("Entered number is not palindrom");

        }
    }
}

