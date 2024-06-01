import java.io.FileInputStream;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args)
        throws IOException {

        int data;
        try (FileInputStream inputStream = new FileInputStream("java.txt")) {
            data = inputStream.read();
            System.out.println("File data in byte form: " + data);
            System.out.println("File Data in Readable form:" + (char)data);
            inputStream.close();
        }



    }
}
