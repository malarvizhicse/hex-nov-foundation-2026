import java.util.Queue;
import java.util.LinkedList;

class Assignment5 {
    public static void main(String[] args) {

        String[] seats = new String[3];
        Queue<String> waitlist = new LinkedList<>();

        String[] learners = {"Asha", "Ravi", "Meena", "Kiran", "Pooja"};

        // Learners joining one by one
        for (String name : learners) {

            boolean assigned = false;

            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == null) {
                    seats[i] = name;
                    assigned = true;
                    break;
                }
            }

            if (!assigned) {
                waitlist.offer(name);
            }

            System.out.println("\nJoin: " + name);
            System.out.println("Seats: " + java.util.Arrays.toString(seats));
            System.out.println("Waiting: " + waitlist);
        }

        // Learner drops out
        String dropout = "Ravi";
        boolean found = false;

        System.out.println("\n" + dropout + " drops out");

        for (int i = 0; i < seats.length; i++) {

            if (dropout.equals(seats[i])) {
                found = true;
                seats[i] = null;

                if (!waitlist.isEmpty()) {
                    seats[i] = waitlist.poll();
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Learner not found in batch.");
        }

        System.out.println("Seats: " + java.util.Arrays.toString(seats));
        System.out.println("Waiting: " + waitlist);
    }
}