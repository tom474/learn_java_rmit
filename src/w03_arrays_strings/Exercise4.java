package w03_arrays_strings;

import static w03_arrays_strings.Exercise3.getIndexMinFrom;

public class Exercise4 {
    public static int[] exchangeMinFrom(int[] numbers, int from) {
        int index = getIndexMinFrom(numbers, from);

        int temp = numbers[from];
        numbers[from] = numbers[index];
        numbers[index] = temp;

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 2, 8, 4, 9, 1, 6};
        int[] exchangedNumbers = exchangeMinFrom(numbers, 3);
        System.out.println("The array after exchanging the minimum value from index 3 is: ");
        for (int exchangedNumber : exchangedNumbers) {
            System.out.print(exchangedNumber + " ");
        }
    }
}
