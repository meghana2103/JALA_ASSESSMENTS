import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add 10 elements to ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        System.out.println("Initial List: " + list);

        // Add an element to the ArrayList
        list.add("Kiwi");
        System.out.println("\nAfter adding 'Kiwi': " + list);

        // Iterate through ArrayList using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        list.add(3, "Coconut");
        System.out.println("\nAfter adding 'Coconut' at index 3: " + list);

        // Remove an element by value
        list.remove("Banana");
        System.out.println("\nAfter removing 'Banana': " + list);

        // Remove element at index
        list.remove(5);
        System.out.println("\nAfter removing element at index 5: " + list);

        // Update element at a specific index
        list.set(2, "Blackberry");
        System.out.println("\nAfter updating index 2 to 'Blackberry': " + list);

        // Check element at a particular index
        String elementAt4 = list.get(4);
        System.out.println("\nElement at index 4: " + elementAt4);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("\nSize of the ArrayList: " + size);

        // Check if a specific element is present
        boolean hasApple = list.contains("Apple");
        System.out.println("\nIs 'Apple' present in the list? " + hasApple);

        // Remove all elements
        list.clear();
        System.out.println("\nAfter clearing all elements: " + list);
    }
}
