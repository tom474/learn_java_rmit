package w2_structure_methods;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Enter the length: ");
        length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
