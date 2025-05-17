import java.io.*;
public class WriteUsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("BufferedWriter writing to file.");
        bw.close();
    }
}