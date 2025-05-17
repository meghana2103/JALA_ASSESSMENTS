class InstanceCallsStatic {
    static void displayStatic() {
        System.out.println("Static Method Called from Instance Method");
    }

    void callStaticMethod() {
        displayStatic();
    }

    public static void main(String[] args) {
        new InstanceCallsStatic().callStaticMethod();
    }
}
