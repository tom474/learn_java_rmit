package w6_file_io.sample_code.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileToConsoleNotBuffered {
    public static void main(String[] args) throws IOException {
        final String SOURCE_FILE = "./src/w6_file_io/sample_code/source.txt";
        long start = System.nanoTime();

        // Use unbuffered InputStream instead of Scanner
        try (InputStream stream = new FileInputStream(SOURCE_FILE)) {
            int next;
            while ((next = stream.read()) != -1) {
                System.out.print((char) next);
            }
            System.out.println();
        } catch (FileNotFoundException fnfe) {
            // Since we have a try block might as well catch here rather than throw to console
            System.err.printf("%s: File not found\n", SOURCE_FILE);
        }
        FileToConsoleScanner.timeLogger(start);
    }
}
