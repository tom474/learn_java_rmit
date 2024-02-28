package w3_arrays_strings;

import java.util.Scanner;

public class Exercise6 {
    public static void swapString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.next();
        System.out.print("Enter the second string: ");
        String secondString = scanner.next();
        System.out.println("Strings before swap: 1st = " + firstString + " and 2nd = "+ secondString);

        firstString = firstString + secondString;
        secondString = firstString.substring(0,firstString.length() - secondString.length());
        firstString = firstString.substring(secondString.length());

        System.out.println("Strings after swap: 1st = " + firstString + " and 2nd = "+ secondString);
    }

    public static void main(String[] args) {
        swapString();
    }
}
