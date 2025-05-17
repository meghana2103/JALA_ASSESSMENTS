class PrivateExample {
    private String message = "This is a private field.";

    private void showMessage() {
        System.out.println("Private Method Called");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println(obj.message); 
        obj.showMessage();               
    }
}

// Subclass trying to access private members (will give error if uncommented)
class SubPrivateExample extends PrivateExample {
    public void accessPrivate() {
        // System.out.println(message);      
        // showMessage();                 
    }
}
