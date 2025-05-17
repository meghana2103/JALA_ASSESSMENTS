class DefaultExample {
    String text = "Default Access Field";
    void display() {
        System.out.println("Default Method Called");
    }
}

class AccessDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println(obj.text);
        obj.display();
    }
}