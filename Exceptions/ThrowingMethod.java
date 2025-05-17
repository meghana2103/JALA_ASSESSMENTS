public class ThrowingMethod {
    static void riskyMethod() throws ArithmeticException {
        throw new ArithmeticException("Thrown from method");
    }

    public static void main(String[] args) throws ArithmeticException {
        riskyMethod();
    }
}