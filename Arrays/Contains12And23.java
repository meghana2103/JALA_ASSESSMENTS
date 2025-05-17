public class Contains12And23 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 15, 23};
        boolean has12 = false, has23 = false;
        for (int num : arr) {
            if (num == 12) has12 = true;
            if (num == 23) has23 = true;
        }
        System.out.println("Contains 12 and 23? " + (has12 && has23));
    }
}