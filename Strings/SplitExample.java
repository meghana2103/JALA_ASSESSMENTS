class SplitExample {
    public static void main(String[] args) {
        String data = "apple,banana,grape";
        String[] fruits = data.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
