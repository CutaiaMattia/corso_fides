import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        Scanner fileIn = null;

        try {
            fileIn = new Scanner(new File("/home/mattia/Desktop/corso_fides/ciao.txt"));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        String line = "";
        while (fileIn.hasNextLine()) {
                line += " " + fileIn.nextLine() + "\n";

        }
        fileIn.close();
        System.out.println(line);
    }
}
