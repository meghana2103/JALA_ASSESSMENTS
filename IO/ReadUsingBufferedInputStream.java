import java.io.*;
public class ReadUsingBufferedInputStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
        int i;
        while ((i = bis.read()) != -1) {
            System.out.print((char) i);
        }
        bis.close();
    }
}
