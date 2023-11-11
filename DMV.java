import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DMV {
    private static Queue<String> license = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the DMV!");

        while (true) {
            // Display choices to the receptionist
            System.out.println("Select an option:");
            System.out.println("1. Enter a new person into the waiting list");
            System.out.println("2. Call the next person");

            // Read the receptionist's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Enter a new person into the waiting list
                    System.out.print("Enter the person's name to add to the waiting list: ");
                    String personName = scanner.nextLine();
                    license.add(personName);
                    System.out.println(personName + " has been added to the waiting list.");
                    break;
                case 2:
                    // Call the next person
                    if (!license.isEmpty()) {
                        String nextPerson = license.poll(); // Remove and return the head of the queue
                        System.out.println("Next person to be served: " + nextPerson);
                    } else {
                        System.out.println("There are no customers. Receptionist can go home.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 or 2.");
                    break;
            }
        }
    }
}
