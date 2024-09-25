package w06_file_io.sample_code.files;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadStudentInfoTextFile {
    public static void main(String[] args) throws IOException {
        // students.txt
        System.out.println("Name of file to read from : ");
        // A try without a catch!
        try (Scanner sc = new Scanner(System.in);
             Scanner fileSc = new Scanner(new FileReader("./src/w6_file_io/sample_code/" + sc.nextLine())))
        {
            System.out.println("Name\t Address\t Age");
            // Could have used Scanner but let's do another approach!
            while (fileSc.hasNextLine()) {
                // See StreamTokenizer class as well
                StringTokenizer inReader = new StringTokenizer(fileSc.nextLine(), "\t");
                if (inReader.countTokens() != 3) {
                    // Let the client handle it!
                    throw new IOException("Invalid Input Format");
                } else {
                    String name = inReader.nextToken();
                    String address = inReader.nextToken();
                    // NOTE: this could fail if the file is corrupt/invalid
                    int age = Integer.parseInt(inReader.nextToken());
                    System.out.printf("%s\t%s\t%d\n", name, address, age);
                }
            }
        }
    }
}
