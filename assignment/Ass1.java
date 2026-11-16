import java.util.ArrayDeque;
import java.util.Queue;

public class Ass1 {
    public static void main(String[] args) {

        // Queue implementation using ArrayDeque
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("harry");
        queue.offer("frodo");
        queue.offer("pippin");

        System.out.println("Queue: " + queue);
        System.out.println("Poll is: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}