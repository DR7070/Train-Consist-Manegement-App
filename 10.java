import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Calculate total capacity using stream
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacities
                .reduce(0, Integer::sum);     // sum them

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}