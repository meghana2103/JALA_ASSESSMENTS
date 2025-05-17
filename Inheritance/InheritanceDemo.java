
class A {
    int value = 10; // Instance variable

    void methodA1() {
        System.out.println("Method A1 in Class A");
    }

    void methodA2() {
        System.out.println("Method A2 in Class A");
    }

    void display() {
        System.out.println("Display method in Class A");
    }
}


class B extends A {
    int value = 20;

    void methodB1() {
        System.out.println("Method B1 in Class B");
    }

    void methodB2() {
        System.out.println("Method B2 in Class B");
    }

    @Override
    void display() {
        System.out.println("Display method in Class B");
    }
}


class C extends B {
    int value = 30;

    void methodC1() {
        System.out.println("Method C1 in Class C");
    }

    void methodC2() {
        System.out.println("Method C2 in Class C");
    }

    @Override
    void display() {
        System.out.println("Display method in Class C");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Calling Methods from Class A");
        objA.methodA1();
        objA.methodA2();
        objA.display();

        System.out.println("Calling Methods from Class B");
        objB.methodA1();
        objB.methodA2();  
        objB.methodB1();
        objB.methodB2();
        objB.display();

        System.out.println("Calling Methods from Class C ");
        objC.methodA1();  
        objC.methodA2();  
        objC.methodB1();  
        objC.methodB2();  
        objC.methodC1();
        objC.methodC2();
        objC.display();

        
        System.out.println("Runtime Polymorphism (Method Overriding) ");
        A ref;
        ref = new B();
        ref.display(); 

        ref = new C();
        ref.display(); 

        // Runtime Polymorphism with Variables (Instance variables are not polymorphic)
        System.out.println("Polymorphism with Instance Variables");
        A varRef;
        varRef = new A();
        System.out.println("Value from A reference pointing to A: " + varRef.value); 
        varRef = new B();
        System.out.println("Value from A reference pointing to B: " + varRef.value); 
        varRef = new C();
        System.out.println("Value from A reference pointing to C: " + varRef.value); 
        // If you want to access actual values:
        System.out.println("Value from B reference: " + ((B) varRef).value); 
        System.out.println("Value from C reference: " + ((C) varRef).value); 
    }
}
