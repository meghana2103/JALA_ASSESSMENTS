class ProtectedExample {
    protected String status = "Protected Field";
    protected void showStatus() {
        System.out.println("Protected Method Called");
    }
}

class AccessProtectedSamePackage {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println(obj.status);
        obj.showStatus();
    }
}
