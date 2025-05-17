class Example {
    static int staticVar1 = 100;
    static String staticVar2 = "Static";

    int instanceVar1 = 200;
    String instanceVar2 = "Instance";

    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {
        Example obj = new Example();

        // Calling static methods
        staticMethod1();
        staticMethod2();

        // Calling instance methods
        obj.instanceMethod1();
        obj.instanceMethod2();

        // Accessing static variables
        System.out.println("Static Var1: " + staticVar1);
        System.out.println("Static Var2: " + staticVar2);

        // Accessing instance variables
        System.out.println("Instance Var1: " + obj.instanceVar1);
        System.out.println("Instance Var2: " + obj.instanceVar2);
    }
}