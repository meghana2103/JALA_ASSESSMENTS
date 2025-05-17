class PrintAllVars {
    static int staticNum = 5;
    static String staticStr = "Static";

    int instanceNum = 10;
    String instanceStr = "Instance";

    public static void main(String[] args) {
        PrintAllVars obj = new PrintAllVars();

        System.out.println("Static Number: " + staticNum);
        System.out.println("Static String: " + staticStr);

        System.out.println("Instance Number: " + obj.instanceNum);
        System.out.println("Instance String: " + obj.instanceStr);
    }
}