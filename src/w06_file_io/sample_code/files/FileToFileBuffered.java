package w06_file_io.sample_code.files;

import java.io.*;

public class FileToFileBuffered {
    public static void main(String[] args) {
        long start = System.nanoTime();

        final String SOURCE_FILE = "./src/w6_file_io/sample_code/source.txt";
        final String DEST_FILE = "./src/w6_file_io/sample_code/dest.txt";

        // Open source and destination
        try (BufferedReader reader = new BufferedReader(new FileReader(SOURCE_FILE));
             PrintStream ps = new PrintStream(new FileOutputStream(DEST_FILE)))
        {
            String line;
            // Loop until end of source file
            while ((line = reader.readLine()) != null) {
                ps.println(line); // Copy line to destination file
            }
        } catch (FileNotFoundException fnfe) {
            // Since we have a try block might as well catch here rather than throw to console
            System.err.printf("%s: File not found\n", SOURCE_FILE);
        } catch (IOException ioe) {
            System.err.println("IOException");
        }
        FileToConsoleScanner.timeLogger(start);
    }
}
