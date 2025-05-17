import java.io.*;
public class FileNotFoundDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("nonexistent.txt");
    }
}