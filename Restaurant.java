import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

public class Restaurant {
    private static Stack<String> seating = new Stack<>();
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Restaurant!");

        while (true) {
            // Prompt the user for their name
            System.out.print("Enter your name to request a table (type 'exit' to leave): ");
            String userName = scanner.nextLine();

            // Check if the user wants to leave
            if (userName.equalsIgnoreCase("exit")) {
                if (!seating.isEmpty()) {
                    // Remove the last person who checked in (last in, first out)
                    String removedName = seating.pop();
                    System.out.println(removedName + " has been removed from the waiting list.");
                } else {
                    System.out.println("The waiting list is empty.");
                }
                continue;
            }

            // Add the user's name to the seating stack
            seating.push(userName);

            // Generate a random wait time
            int waitTime = random.nextInt(1, 45);

            // Display wait time to the user
            System.out.println("Thank you, " + userName + "! Your estimated wait time is " + waitTime + " minutes.");

            // Prompt the user for whether they want to wait or leave
            System.out.print("Would you like to wait for a table? (yes/no): ");
            String userDecision = scanner.nextLine();

            if (userDecision.equalsIgnoreCase("no")) {
                // If the user decides not to wait, remove their name from the list
                if (!seating.isEmpty()) {
                    String removedName = seating.pop();
                    System.out.println(removedName + " has been removed from the waiting list.");
                } else {
                    System.out.println("The waiting list is empty.");
                }
            }
        }
    }
}
