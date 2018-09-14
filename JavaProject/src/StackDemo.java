import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Initial stack: " + stack);

        System.out.println("Searching value 3 in stack...");
        System.out.println(stack.search(3));

        System.out.println("Searching value 10 in stack...");
        System.out.println(stack.search(10));

        stack.pop();
        stack.pop();

        System.out.println("Pushing values 6,7,8 into stack...");

        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println("First element of the stack: " + stack.peek());



        System.out.println("Final stack: " + stack);
    }
}
