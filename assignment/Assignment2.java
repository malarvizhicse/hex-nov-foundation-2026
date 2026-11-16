import java.util.LinkedList;
import java.util.Queue;

class Assignment2 {
    public static void main(String[] args) {

        // LinkedList implementation
        Queue<String> linkedList = new LinkedList<>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");

        System.out.println("LinkedList: " + linkedList);

        System.out.println("Poll is: " + linkedList.poll());

        System.out.println("LinkedList after poll: " + linkedList);
    }
}