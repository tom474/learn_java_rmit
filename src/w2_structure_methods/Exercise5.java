package w2_structure_methods;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle 1's coordinates and radius: ");
        double x1, y1, rad1;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        rad1 = scanner.nextDouble();

        System.out.println("Enter circle 2's coordinates and radius:");
        double x2, y2, rad2;
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        rad2 = scanner.nextDouble();

        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        if (distance <= Math.abs(rad1 - rad2)){
            System.out.println("Circle 2 is inside circle 1");
        } else if (distance <= rad1 + rad2){
            System.out.println("Circle 2 overlaps circle 1");
        } else {
            System.out.println("Outside");
        }
    }
}
