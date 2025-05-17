import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int remove = 30;
        int[] newArr = Arrays.stream(arr).filter(e -> e != remove).toArray();
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
}