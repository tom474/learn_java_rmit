package w2_structure_methods;

public class Exercise6 {
    public static void main(String[] args) {
        int min = 0;
        int max = 9;
        int range = max - min + 1;
        int[] numbers = new int[max + 1];
        for (int i = 0; i < 100; ++i) {
            int rand = (int) (Math.random() * range) + min;
            numbers[rand] += 1;
        }
        for (int i = min; i <= max; ++i) {
            if (numbers[i] > 0) {
                System.out.println(i + ": " + numbers[i]);
            }
        }
    }
}
