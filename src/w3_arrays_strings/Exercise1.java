package w3_arrays_strings;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static int[] createRandomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round(Math.random() * n);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = createRandomArray();
        System.out.println(Arrays.toString(array));
    }
}
