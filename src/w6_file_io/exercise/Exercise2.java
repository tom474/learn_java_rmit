package w6_file_io.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("./src/w6_file_io/exercise/users.txt"));
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }

        input.close();
    }
}
