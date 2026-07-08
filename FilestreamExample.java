import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("stream.txt");
            String text = "Learning Java File Streams";
            fos.write(text.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("stream.txt");
            int ch;

            System.out.println("File Content:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
