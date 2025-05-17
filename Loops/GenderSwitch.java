public class GenderSwitch {
    public static void main(String[] args) {
        char gender = 'F';

        switch(gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
