package w6_file_io.sample_code.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteStudentInfoTextFile {
    public static void main(String[] args) {
        System.out.println("Enter the name of the file : ");

        try (Scanner sc = new Scanner(System.in);
             PrintWriter pw = new PrintWriter(new FileWriter("./src/w6_file_io/sample_code/" + sc.nextLine())))
        {
            do {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine(); // Clear trailing newline from nextInt()
                // Write input data to file
                pw.printf("%s\t%s\t%d\n", name, address, age);
                System.out.println("Continue  Y/N ?");
            } while (Character.toUpperCase(sc.nextLine().charAt(0)) == 'Y');
            System.out.println("End program.");
            pw.close();
            sc.close();
        } catch (IOException e) {
            // Note that FileWriter throws a different exception to the previous
            // FileInputStream/FileInputStream examples
            e.printStackTrace();
        }
    }
}
