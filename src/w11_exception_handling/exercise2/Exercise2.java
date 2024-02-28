package w11_exception_handling.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(getIntFromUser(5));
    }

    public static int getIntFromUser(int defaultValue){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String input = sc.nextLine();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e){
            return defaultValue;
        } finally {
            sc.close();
        }
    }
}
