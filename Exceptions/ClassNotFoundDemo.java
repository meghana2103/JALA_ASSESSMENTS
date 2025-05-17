public class ClassNotFoundDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.unknown.ClassName");
    }
}
