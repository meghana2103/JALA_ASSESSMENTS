import java.io.*;
public class ReadUsingInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}