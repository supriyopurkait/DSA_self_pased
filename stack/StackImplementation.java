import java.util.*;

public class StackImplementation {
    // Push element onto the stack
    void stack_push(Stack<Integer> stack) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter an element to push:");
        int ele = ob.nextInt();
        stack.push(ele);
    }

    // Pop element from the stack
    void stack_pop(Stack<Integer> stack) {
        try {
            int val = stack.pop();
            System.out.println("Popped item is: " + val);
        } catch (EmptyStackException e) {
            System.out.println("Underflow: Stack is empty");
        }
    }

    // Peek at the top element of the stack
    void stack_peek(Stack<Integer> stack) {
        try {
            int val = stack.peek();
            System.out.println("Topmost item is: " + val);
        } catch (Exception e) {
            System.out.println("Underflow: Stack is empty");
        }
    }

    // Display all elements of the stack
    void stack_display(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Underflow: Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int ele : stack) {
                System.out.print(ele + " -> ");
            }
            System.out.println("End of stack");
        }
    }

    // Main method
    public static void main(String[] args) {
        Stack<Integer> sample = new Stack<>();
        Scanner ob = new Scanner(System.in);
        StackImplementation ob2 = new StackImplementation();

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\nEnter choice:");
            int ch = ob.nextInt();
            switch (ch) {
                case 1:
                    ob2.stack_push(sample);
                    break;
                case 2:
                    ob2.stack_pop(sample);
                    break;
                case 3:
                    ob2.stack_peek(sample);
                    break;
                case 4:
                    ob2.stack_display(sample);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }
    }
}
