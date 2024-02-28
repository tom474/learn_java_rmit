package w2_structure_methods;

import java.util.Scanner;

public class Exercise3 {
    public static double squareRoot(int number) {
        double min = 1, max = number;
        double avg = (min + max) / 2;
        final double threshold = 0.0000000001;

        while (Math.abs(avg * avg - number) > threshold) {
            if (avg * avg > number) {
                max = avg;
            } else if (avg * avg < number) {
                min = avg;
            }
            avg = (min + max) / 2;
        }

        return avg;
    }
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number > 1: ");
        number = scanner.nextInt();
        while (number <= 1) {
            System.out.print("The number has to be > 1. Enter again: ");
            number = scanner.nextInt();
        }
        System.out.println(squareRoot(number));
    }
}
