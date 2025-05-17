// Interface with one method
interface OneMethod {
    void display();
}

class OneMethodImpl implements OneMethod {
    public void display() {
        System.out.println("OneMethod interface implemented.");
    }
}

// Interface with two methods but implement only one
interface TwoMethods {
    void show();
    void hide();
}

abstract class PartialImpl implements TwoMethods {
    public void show() {
        System.out.println("Show method implemented.");
    }
}

// Using interface instance to call method
interface Greet {
    void greetUser();
}

class GreetImpl implements Greet {
    public void greetUser() {
        System.out.println("Hello from GreetImpl");
    }
}

// Two interfaces with one method each
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class ABImpl implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }
    public void methodB() {
        System.out.println("Method B");
    }
}

// Two interfaces with same method
interface Same1 {
    void common();
}

interface Same2 {
    void common();
}

class SameImpl implements Same1, Same2 {
    public void common() {
        System.out.println("Common method from both interfaces");
    }
}

//  Interface with default method
interface DefaultMethod {
    default void defaultShow() {
        System.out.println("Default implementation");
    }
}

class DefaultImpl implements DefaultMethod {
    // No need to override
}

//  Interface inheritance
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class InterfaceInheritanceImpl implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent method");
    }
    public void childMethod() {
        System.out.println("Child method");
    }
}

//  Public interface with fields and methods
public interface Info {
    int AGE = 25;
    String NAME = "Meghana";

    void printInfo();
}

class InfoImpl implements Info {
    public void printInfo() {
        System.out.println("Name: " + NAME + ", Age: " + AGE);
    }
}

//  Private/protected interfaces - not allowed in top level Java, can only be inner
class PrivateInterfaceExample {
    private interface PrivateInf {
        void secret();
    }
    class Inner implements PrivateInf {
        public void secret() {
            System.out.println("Private interface method");
        }
    }

    void usePrivate() {
        Inner obj = new Inner();
        obj.secret();
    }
}

//  Interface with private, public, protected fields – Not allowed, only public static final
interface InvalidFields {
    // All are implicitly public static final
    int A = 10;
    // private int B = 20; // Compilation error
    // protected int C = 30; // Compilation error
}

//  Interface with static final variable
interface Constants {
    static final int MAX = 100;
}

class ConstantsTest implements Constants {
    void printMax() {
        System.out.println("MAX: " + MAX);
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        new OneMethodImpl().display();

        TwoMethods tm = new PartialImpl() {
            public void hide() {
                System.out.println("Hide method implemented via anonymous class");
            }
        };
        tm.show();
        tm.hide();

        Greet g = new GreetImpl();
        g.greetUser();

        ABImpl ab = new ABImpl();
        ab.methodA();
        ab.methodB();

        SameImpl s = new SameImpl();
        s.common();

        DefaultImpl d = new DefaultImpl();
        d.defaultShow();

        InterfaceInheritanceImpl ih = new InterfaceInheritanceImpl();
        ih.parentMethod();
        ih.childMethod();

        InfoImpl info = new InfoImpl();
        info.printInfo();

        PrivateInterfaceExample pie = new PrivateInterfaceExample();
        pie.usePrivate();

        ConstantsTest ct = new ConstantsTest();
        ct.printMax();
    }
}
