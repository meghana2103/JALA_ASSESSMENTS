class StaticAccessInstance {
    int instanceVar = 10;

    static void printInstanceVar() {
        StaticAccessInstance obj = new StaticAccessInstance();
        System.out.println("Instance Variable from Static Method: " + obj.instanceVar);
    }

    public static void main(String[] args) {
        printInstanceVar();
    }
}