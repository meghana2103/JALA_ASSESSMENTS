class CallMethodsInMain {
    static void staticMethod() {
        System.out.println("Static Method Called in Main");
    }

    void instanceMethod() {
        System.out.println("Instance Method Called in Main");
    }

    public static void main(String[] args) {
        staticMethod();

        CallMethodsInMain obj = new CallMethodsInMain();
        obj.instanceMethod();
    }
}
