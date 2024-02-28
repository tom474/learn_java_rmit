package w1_introduction;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer: ");
            num = sc.nextInt();
            if (num <= 0) {
                break;
            }
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.println(num + " is divisible by both 5 and 6");
            } else if (num % 5 == 0 || num % 6 == 0) {
                System.out.println(num + " is divisible by either 5 or 6, but not both");
            } else {
                System.out.println(num + " is neither divisible by 5 or 6");
            }
        }
        System.out.println("Goodbye!");
    }
}
