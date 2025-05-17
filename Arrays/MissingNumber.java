public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[99];
        int missing = 57; // simulate missing
        for (int i = 0, j = 1; j <= 100; j++) {
            if (j == missing) continue;
            arr[i++] = j;
        }
        int expectedSum = 100 * 101 / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }
}
