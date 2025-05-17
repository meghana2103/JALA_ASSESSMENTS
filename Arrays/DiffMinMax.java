public class DiffMinMax {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9};
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Difference: " + (max - min));
    }
}
