import java.util.LinkedList;
import java.util.Scanner;

public class Movies {
    private LinkedList<String> movies;
    private static Scanner scnr;
    // Constructor to create empty LinkedList
    public Movies() {
        movies = new LinkedList<>();
        scnr = new Scanner(System.in);
    }

    public void addMovie(String movieTitle) {
        movies.add(movieTitle);
        System.out.println("Current movie list: " +  movies);
    }

    public void deleteMovie() {
        if (movies.isEmpty()) {
            System.out.println("No movies in the list.");
            return;
        }
        else {
            System.out.println("Current movie list:");
            for (int i = 0; i < movies.size(); ++i) {
                System.out.print("Index: " + i + " Title: " + movies.get(i) + "\n");
            }
            System.out.println("Enter the movie index you would like to delete");
            int indexToDelete = scnr.nextInt();

            if (indexToDelete >= 0 & indexToDelete < movies.size()) {
                System.out.println("Movie being deleted: " + movies.get(indexToDelete));
                movies.remove(indexToDelete);
                System.out.println("Current movie list: " + movies);
            }
            else {
                System.out.println("Invalid index. No movie deleted.");
            }
        }
    }

    public void editMovie() {
        if (movies.isEmpty()) {
            System.out.println("No movies in the list.");
            return;
        }
        else {
            System.out.println("Current movie list: ");
            for (int i = 0; i < movies.size(); ++i) {
                System.out.print("Index: " + i + " Title: " + movies.get(i) + "\n");
            }
            // Prompt the user to choose a movie to edit by index
            System.out.print("Enter the index of the movie you want to edit: ");
            int index = scnr.nextInt();
            scnr.nextLine(); // Consume the newline character after nextInt()
            if (index >= 0 && index < movies.size()) {
                // Prompt for the edited name
                System.out.print("Enter the new name for the movie: ");
                String newMovieName = scnr.nextLine();
                // Replace the old name with the new name in the linked list
                movies.set(index, newMovieName);
                System.out.println("Movie edited successfully.");
                for (int i = 0; i < movies.size(); ++i) {
                    System.out.print("Index: " + i + " Title: " + movies.get(i) + "\n");
                }
            }
            else {
                System.out.println("Invalid index. No movie edited.");
            }
        }
    }


    public static void main(String[] args) {
        Movies movieList = new Movies();
        System.out.println("Welcome to Movie Tracker!");
        int actionNum;
        int exitNum = 9;
        do {
            System.out.println("Please select an action by entering its corresponding number. " +
                    "If you have not added any movies to the list, please start with Action [1].\n"
                    + "[1]: Add Movie\n" + "[2]: Delete Movie\n" + "[3]: Edit Movie\n" + "[9]: Exit Program");
            actionNum = scnr.nextInt();
            scnr.nextLine(); // Consume the newline character after nextInt()
            switch (actionNum) {
                case 1:
                    System.out.println("Enter the name of a movie to add");
                    String movieTitle = scnr.nextLine();
                    movieList.addMovie(movieTitle);
                    break;
                case 2:
                    movieList.deleteMovie();
                    break;
                case 3:
                    movieList.editMovie();
                    break;
                case 9:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Please enter a valid Action Number");
            }
        } while (actionNum != exitNum);
    }
}
