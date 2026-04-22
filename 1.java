import java.util.Scanner;
import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG450", "BG512"};

        // Ensure sorted (important step)
        Arrays.sort(bogieIDs);

        // Input
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        // Output
        if (found) {
            System.out.println("Bogie ID found ✅");
        } else {
            System.out.println("Bogie ID not found ❌");
        }

        sc.close();
    }
}