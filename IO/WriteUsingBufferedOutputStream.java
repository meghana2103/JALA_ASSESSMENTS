import java.io.*;
public class WriteUsingBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
        String text = "Buffered output example.";
        bos.write(text.getBytes());
        bos.flush();
        bos.close();
    }
}
