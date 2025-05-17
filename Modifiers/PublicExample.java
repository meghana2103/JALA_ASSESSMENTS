public class PublicExample {
    public String title = "Public Field";
    public void showTitle() {
        System.out.println("Public Method Called");
    }
}

class AccessPublicSamePackage {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println(obj.title);
        obj.showTitle();
    }
}