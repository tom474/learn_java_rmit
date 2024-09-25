package w03_arrays_strings;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise7 {
    public static void uniqueNumbers(){
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.print("Enter a sequence of integers: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean invalid = false;
            String[] array = scanner.nextLine().split(" +");
            for (String s: array) {
                if (!s.matches("-?\\+?\\d+")) {
                    System.out.println("Please enter a valid list of integers!!!");
                    invalid = true;
                }
            }
            if (invalid) {
                continue;
            }
            for (String s : array) {
                Integer num = Integer.parseInt(s);
                Integer freq = map.get(num);
                map.put(num, (freq == null ? 1 : freq + 1));
            }
            break;
        }
        for (Integer num: map.keySet()){
            if (map.get(num) == 1){
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        uniqueNumbers();
    }
}
