import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG450", "BG512"};

        // Take input
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop when found
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID found ✅");
        } else {
            System.out.println("Bogie ID not found ❌");
        }

        sc.close();
    }
}