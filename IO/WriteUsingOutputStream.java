import java.io.*;
public class WriteUsingOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        String text = "Hello OutputStream!";
        fos.write(text.getBytes());
        fos.close();
    }
}
