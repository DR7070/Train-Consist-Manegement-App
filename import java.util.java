import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Empty bogie list
        List<String> bogieIDs = new ArrayList<>();

        try {
            // Defensive check
            if (bogieIDs.isEmpty()) {
                throw new IllegalStateException("Cannot perform search: Train has no bogies!");
            }

            // Search logic (won’t execute if empty)
            String searchKey = "BG101";
            boolean found = false;

            for (String id : bogieIDs) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "Bogie found ✅" : "Bogie not found ❌");

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}