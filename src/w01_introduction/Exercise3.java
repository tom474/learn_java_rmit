package w01_introduction;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int second, hour, minute;
        System.out.println("Enter the seconds: ");
        second = scanner.nextInt();

        hour = second / 3600;
        second =  second % 3600;
        minute = second / 60;
        second = second % 60;

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
