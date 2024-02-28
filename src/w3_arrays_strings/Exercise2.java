package w3_arrays_strings;

public class Exercise2 {
    public static int getMinIndexFrom(int[] numbers) {
        int indexMin = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[indexMin]) {
                indexMin = i;
            }
        }

        return indexMin;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 2, 8, 4, 9, 1, 6};
        int index = getMinIndexFrom(numbers);
        System.out.println("The index of the minimum value is: " + index);
    }
}
