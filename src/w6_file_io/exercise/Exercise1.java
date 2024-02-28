package w6_file_io.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter("./src/w6_file_io/exercise/users.txt", true));
        Scanner scanner = new Scanner(System.in);
        String name, address, ages;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your address: ");
        address = scanner.nextLine();
        System.out.print("Enter your age: ");
        ages = scanner.nextLine();

        output.println(name + " " + address + " " + ages);
        output.flush();
        output.close();
    }
}
