class InstanceAccessStatic {
    static String message = "Hello from static variable";

    void showStaticVar() {
        System.out.println("Static Variable from Instance Method: " + message);
    }

    public static void main(String[] args) {
        new InstanceAccessStatic().showStaticVar();
    }
}