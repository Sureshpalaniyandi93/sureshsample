import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {


    Properties p = new Properties();
    FileInputStream file = new FileInputStream("src/test/text.properties");
    p.load(file);
        System.out.println(p);

}
}