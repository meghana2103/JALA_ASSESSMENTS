class RegexMatchExample {
    public static void main(String[] args) {
        String str = "abc123";
        boolean result = str.matches("[a-z]+\\d+");
        System.out.println("Matches regex: " + result);
    }
}
