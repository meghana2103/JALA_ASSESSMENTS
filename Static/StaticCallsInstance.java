class StaticCallsInstance {
    void showMessage() {
        System.out.println("Instance Method Called from Static Method");
    }

    static void invokeInstanceMethod() {
        StaticCallsInstance obj = new StaticCallsInstance();
        obj.showMessage();
    }

    public static void main(String[] args) {
        invokeInstanceMethod();
    }
}
