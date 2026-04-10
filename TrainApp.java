import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty list
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial number of bogies: " + trainConsist.size());

        System.out.println("Train initialized successfully.");
    }
}