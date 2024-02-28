package w6_file_io.sample_code.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMarksTextFile {
    public static void main(String[] args) {
        final String SOURCE_FILE = "./src/w6_file_io/sample_code/marks.txt";

        // Create scanner from File class (can also use either a Reader or InputStream)
        try (Scanner input = new Scanner(new File(SOURCE_FILE))) {
            int sum = 0, count = 0;
            while (input.hasNext()) {
                String sNum = input.next();
                String firstName = input.next();
                int mark = input.nextInt();
                sum += mark;
                count++;
                System.out.printf("%s : %s : %d\n", sNum, firstName, mark);
            }

            if (count > 0) {
                System.out.printf("Average mark = %d\n", Math.round((double) sum / count));
            }
        }
        // Since we have a try block might as well catch here rather than throw to console
        catch (FileNotFoundException fnfe) {
            System.err.printf("%s: File not found\n", SOURCE_FILE);
        } catch (Exception e) {
            // General catch all
            System.err.printf("%s: File read error .. check file format!\n", SOURCE_FILE);
        }
    }
}
