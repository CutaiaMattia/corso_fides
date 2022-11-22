
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteFile {

    public static void main(String[] args) {
        PrintWriter fileOut = null;

        try {
            fileOut = new PrintWriter(new FileOutputStream("/home/mattia/Desktop/corso_fides/fileTesto.txt",true));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        fileOut.println("sono");
        fileOut.close();
    }
}
