class StringCompareExample {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.startsWith("Ja"));
        System.out.println(str1.endsWith("va"));
        System.out.println(str1.compareTo(str2));
    }
}