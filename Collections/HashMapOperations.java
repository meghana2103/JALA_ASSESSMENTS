import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {
    public static void main(String[] args) {
        // Create a HashMap with 10 student ID-name pairs
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Meghana");
        studentMap.put(102, "Aarav");
        studentMap.put(103, "Bhavya");
        studentMap.put(104, "Charan");
        studentMap.put(105, "Diya");
        studentMap.put(106, "Eshan");
        studentMap.put(107, "Farhan");
        studentMap.put(108, "Gita");
        studentMap.put(109, "Hari");
        studentMap.put(110, "Ishita");

        System.out.println("Initial Map: " + studentMap);

        // Insert a key-value mapping
        studentMap.put(111, "Jay");
        System.out.println("\nAfter inserting (111, Jay): " + studentMap);

        // Fetch the value for a key
        String name = studentMap.get(104);
        System.out.println("\nValue for key 104: " + name);

        // Clone the HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("\nCloned Map: " + clonedMap);

        // Check if a key is in the map
        boolean hasKey = studentMap.containsKey(105);
        System.out.println("\nDoes key 105 exist? " + hasKey);

        // Check if a value is in the map
        boolean hasValue = studentMap.containsValue("Bhavya");
        System.out.println("Does value 'Bhavya' exist? " + hasValue);

        // Check if map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Print size of the map
        System.out.println("Size of the map: " + studentMap.size());

        // Print all keys
        System.out.println("All keys: " + studentMap.keySet());

        // Print all values
        System.out.println("All values: " + studentMap.values());

        // Remove a specific key-value pair
        studentMap.remove(108);
        System.out.println("\nAfter removing key 108: " + studentMap);

        // Copy all elements to another map
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(studentMap);
        System.out.println("\nNew Map (after copying): " + newMap);
    }
}
