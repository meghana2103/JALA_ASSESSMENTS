public class VariableScope {
    int number = 10; // Global variable

    void display() {
        int number = 20; // Local variable
        System.out.println("Local variable: " + number);
        System.out.println("Global variable using this: " + this.number);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.display();
    }
}
