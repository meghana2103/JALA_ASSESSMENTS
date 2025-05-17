import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grapes");
        fruits.add("Honeydew");
        fruits.add("Kiwi");
        fruits.add("Lemon");

        System.out.println("Initial HashSet: " + fruits);

        // Add a duplicate element (HashSet does not allow duplicates)
        boolean added = fruits.add("Apple");
        System.out.println("Attempt to add duplicate 'Apple': " + added);
        System.out.println("HashSet after trying to add duplicate: " + fruits);

        // Add a new element
        fruits.add("Mango");
        System.out.println("After adding 'Mango': " + fruits);

        // Remove an element
        fruits.remove("Date");
        System.out.println("After removing 'Date': " + fruits);

        // Check if an element exists
        boolean contains = fruits.contains("Kiwi");
        System.out.println("Does HashSet contain 'Kiwi'? " + contains);

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Get size of HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // Check if HashSet is empty
        System.out.println("Is HashSet empty? " + fruits.isEmpty());

        // Clone the HashSet
        HashSet<String> clonedSet = (HashSet<String>) fruits.clone();
        System.out.println("Cloned HashSet: " + clonedSet);

        // Clear all elements
        fruits.clear();
        System.out.println("After clearing HashSet: " + fruits);
        System.out.println("Is HashSet empty now? " + fruits.isEmpty());
    }
}
