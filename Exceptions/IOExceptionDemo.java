import java.io.*;
public class IOExceptionDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        System.out.println(br.readLine());
        br.close();
    }
}