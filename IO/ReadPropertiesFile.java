import java.io.*;
import java.util.*;
public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);
        System.out.println("username: " + prop.getProperty("username"));
        fis.close();
    }
}