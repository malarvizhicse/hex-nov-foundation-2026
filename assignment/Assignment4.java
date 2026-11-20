import java.util.Scanner;
import java.util.Stack;

class Assignment4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> learners = new Stack<>();

      while (true) {
            System.out.println("\n1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter learner name: ");
                    String name = sc.nextLine();
                    learners.push(name);
                    System.out.println("Enrolled: " + name);
                    break;

                case 2:
                    if (!learners.isEmpty()) {
                        System.out.println("Undone: " + learners.pop());
                    } else {
                        System.out.println("Nothing to undo.");
                    }
                    break;

                case 3:
                    if (!learners.isEmpty()) {
                        System.out.println("Last enrollment: " + learners.peek());
                    } else {
                        System.out.println("Nothing to undo.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}