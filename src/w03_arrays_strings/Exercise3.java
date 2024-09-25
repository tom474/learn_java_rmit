package w03_arrays_strings;

public class Exercise3 {
    public static int getIndexMinFrom (int[] numbers, int from){
        int indexMin = from;

        for (int i = from; i < numbers.length; i++){
            if (numbers[i] < numbers[indexMin]) {
                indexMin = i;
            }
        }

        return indexMin;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 2, 8, 4, 9, 1, 6};
        int index = getIndexMinFrom(numbers, 3);
        System.out.println("The index of the minimum value is: " + index);
    }
}
