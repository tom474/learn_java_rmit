package w6_file_io.sample_code.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FileToConsoleScanner {
    public static void main(String[] args) {
        final String SOURCE_FILE = "./src/w6_file_io/sample_code/source.txt";

        // Time the file read, so we can compare to FileToConsoleBuffered!
        long start = System.nanoTime();

        // Create scanner from file stream (can use either a Reader or InputStream)
        // An InputStream just like System.in (look at Scanner constructors in API!)
        try (Scanner sc = new Scanner(new FileInputStream(SOURCE_FILE))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            // Since we have a try block might as well catch here rather than throw to console
            System.err.printf("%s: File not found\n", SOURCE_FILE);
        } catch (Exception e) {
            System.err.print("General error");
            System.exit(-1);
        }
        timeLogger(start);
    }

    public static void timeLogger(long start) {
        System.out.printf("I/O took %dms", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));
    }
}
