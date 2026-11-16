import java.util.ArrayDeque;

public class Assignment1 {
    public static void main(String[] args) {

        // Stack implementation using ArrayDeque
        ArrayDeque<String> newStack = new ArrayDeque<>();

        newStack.push("Harry Potter");
        newStack.push("Ronald Weasley");
        newStack.push("Hermione Granger");

        System.out.println("Stack: " + newStack);
        System.out.println("Peek is: " + newStack.peek());
        System.out.println("Pop is: " + newStack.pop());
        System.out.println("Stack after pop: " + newStack);
    }
}