import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie type names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        System.out.println("\nOriginal Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        // Sort using built-in method
        Arrays.sort(bogieTypes);

        // Display sorted result
        System.out.println("\nSorted Bogie Types (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));
    }
}