package w3_arrays_strings;

import java.util.Arrays;

import static w3_arrays_strings.Exercise4.exchangeMinFrom;

public class Exercise5 {
    public static int[] sortBySelection(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            exchangeMinFrom(numbers, i);
            System.out.print((i + 1) + "th iteration: ");
            System.out.println(Arrays.toString(numbers));
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 2, 8, 4, 9, 1, 6};
        int[] sortedNumbers = sortBySelection(numbers);
        System.out.println("The array after sorting by selection is: ");
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
