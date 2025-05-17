import java.io.*;
public class WriteUsingFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello using FileWriter!");
        fw.close();
    }
}
