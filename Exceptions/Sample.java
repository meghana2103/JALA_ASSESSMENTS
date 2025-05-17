import java.lang.reflect.*;
class Sample {
    public int x;
}

public class NoSuchFieldDemo {
    public static void main(String[] args) throws NoSuchFieldException {
        Field field = Sample.class.getField("y");
    }
}
