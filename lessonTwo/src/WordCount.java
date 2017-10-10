import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("inputFile.txt");
        Scanner fileScanner = new Scanner(file);
        int count = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            count += line.split(" ").length;
        }

        System.out.println("Total words are: " + count);
    }
}
