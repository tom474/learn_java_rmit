package w01_introduction;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of A: ");
        double x1 , y1;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of B: ");
        double x2 , y2;
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        double lengthAB = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double circumference = lengthAB * 4;
        double area = lengthAB * lengthAB;

        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);
    }
}
