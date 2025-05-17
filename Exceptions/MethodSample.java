class MethodSample {
    public void display() {}
}

public class NoSuchMethodDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        Method m = MethodSample.class.getMethod("show");
    }
}