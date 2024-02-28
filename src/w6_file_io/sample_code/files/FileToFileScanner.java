package w6_file_io.sample_code.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileToFileScanner {
    public static void main(String[] args) {
        long start = System.nanoTime();

        final String SOURCE_FILE = "./src/w6_file_io/sample_code/source.txt";
        final String DEST_FILE = "./src/w6_file_io/sample_code/dest.txt";

        // Open source and destination
        try (Scanner sc = new Scanner(new FileInputStream(SOURCE_FILE));
             PrintStream ps = new PrintStream(DEST_FILE))
        {
            // Loop until end of source file
            while (sc.hasNextLine()) {
                ps.println(sc.nextLine()); // Copy line to destination file
            }
        } catch (FileNotFoundException fnfe) {
            // Since we have a try block might as well catch here rather than throw to console
            System.err.printf("%s: File not found\n", SOURCE_FILE);
        }
        FileToConsoleScanner.timeLogger(start);
    }
}
