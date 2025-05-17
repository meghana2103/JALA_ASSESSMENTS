public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 30;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
