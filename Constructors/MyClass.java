// Class with default, one-argument and two-argument constructors
class MyClass {
    MyClass() {
        System.out.println("Default Constructor");
    }

    MyClass(int x) {
        System.out.println("One-Argument Constructor: " + x);
    }

    MyClass(int x, int y) {
        System.out.println("Two-Argument Constructor: " + x + ", " + y);
    }
}

class ConstructorTest1 {
    public static void main(String[] args) {
        new MyClass();
        new MyClass(10);
        new MyClass(10, 20);
    }
}

// Call superclass constructors from subclass
class SuperClass {
    SuperClass() {
        System.out.println("Default Constructor in SuperClass");
    }

    SuperClass(String msg) {
        System.out.println("Argument Constructor in SuperClass: " + msg);
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super();
        System.out.println("Default Constructor in SubClass");
    }

    SubClass(String msg) {
        super(msg);
        System.out.println("Argument Constructor in SubClass");
    }
}

class ConstructorTest2 {
    public static void main(String[] args) {
        new SubClass();
        new SubClass("Hello");
    }
}

//  Constructors with access modifiers
class ModifierConstructor {
    private ModifierConstructor() {
        System.out.println("Private Constructor");
    }

    public ModifierConstructor(int x) {
        System.out.println("Public Constructor: " + x);
    }

    protected ModifierConstructor(String s) {
        System.out.println("Protected Constructor: " + s);
    }

    ModifierConstructor(double d) {
        System.out.println("Default Constructor (package-private): " + d);
    }

    public static void main(String[] args) {
        new ModifierConstructor();
        new ModifierConstructor(5);
        new ModifierConstructor("Test");
        new ModifierConstructor(3.14);
    }
}

// Constructors with return types (Invalid usage demo)
class InvalidConstructor {
    // Not a constructor, just a method
    int InvalidConstructor() {
        System.out.println("This is NOT a constructor (int)");
        return 1;
    }

    String InvalidConstructor(String str) {
        System.out.println("This is NOT a constructor (String)");
        return str;
    }

    InvalidConstructor() {
        System.out.println("Actual constructor");
    }

    public static void main(String[] args) {
        InvalidConstructor obj = new InvalidConstructor();
        obj.InvalidConstructor();
        obj.InvalidConstructor("Hello");
    }
}

//  Try to call constructor multiple times with the same object
class RepeatedConstructor {
    RepeatedConstructor() {
        System.out.println("Constructor called");
    }

    void display() {
        System.out.println("Display method called");
    }
}

class ConstructorTest5 {
    public static void main(String[] args) {
        RepeatedConstructor obj = new RepeatedConstructor();
        obj.display();
        obj.display();
        // Constructor can't be called again on the same object explicitly
        // obj.RepeatedConstructor(); // This will cause an error
    }
}
