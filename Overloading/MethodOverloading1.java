//  Methods with same name but different number of parameters (same type)
class MethodOverloading1 {
    void display(int a) {
        System.out.println("Method with 1 int parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Method with 2 int parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        MethodOverloading1 obj = new MethodOverloading1();
        obj.display(10);
        obj.display(10, 20);
    }
}

//  Methods with same name but different number of parameters (different type)
class MethodOverloading2 {
    void print(int a) {
        System.out.println("int: " + a);
    }

    void print(double a) {
        System.out.println("double: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading2 obj = new MethodOverloading2();
        obj.print(10);
        obj.print(10.5);
    }
}

//  Methods with same name and same number of parameters of same type
class MethodOverloading3 {
    void show(int a) {
        System.out.println("show(int): " + a);
    }

    // This is not allowed: duplicate method
    // void show(int b) {
    //     System.out.println("show(int): " + b);
    // }

    public static void main(String[] args) {
        MethodOverloading3 obj = new MethodOverloading3();
        obj.show(5);
    }
}

// Methods with same name and same number of parameters of different type
class MethodOverloading4 {
    void process(int a) {
        System.out.println("int: " + a);
    }

    void process(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading4 obj = new MethodOverloading4();
        obj.process(5);
        obj.process("Hello");
    }
}

// Same name, number of parameters, data type but different return type
class MethodOverloading5 {
    
    
    public static void main(String[] args) {
        System.out.println("Methods cannot differ only by return type in Java.");
    }
}
