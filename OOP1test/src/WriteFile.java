import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class WriteFile {
    public static void Writer() {
        try {
            //ReadFile reader = new ReadFile;
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write("data");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}