package w06_file_io.sample_code.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileToConsoleBuffered {
    public static void main(String[] args) throws IOException {
        final String SOURCE_FILE = "./src/w6_file_io/sample_code/source.txt";

        long start = System.nanoTime();

        // Use BufferedReader instead of Scanner
        try (BufferedReader reader = new BufferedReader(new FileReader(SOURCE_FILE))) {
            String nextLine;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
            }
        } catch (FileNotFoundException fnfe) {
            // Since we have a try block might as well catch here rather than throw to console
            System.err.printf("%s: File not found\n", SOURCE_FILE);
        }
        FileToConsoleScanner.timeLogger(start);
    }
}
