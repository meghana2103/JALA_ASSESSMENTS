import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));
    }
}
