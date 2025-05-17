import java.util.Arrays;
public class RemoveAndReturnNew {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int[] newArr = Arrays.stream(arr).distinct().toArray();
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
}