package w05_oop_basics_2;

import java.util.HashMap;
import java.util.Map;

public class Exercise7 {
    public static void main(String[] args) {
        String[] name = {
            new String("Minh"),
            new String("Hoa"),
            new String("Hai"),
            new String("Sang"),
            new String("Hai")
        };

        Map m = new HashMap();

        for (int i = 0; i < name.length; i++) {
            Integer freq = (Integer) m.get(name[i]);

            m.put(name[i], (freq == null ? 1 : freq.intValue() + 1));
        }

        System.out.println(m.size() + " distinct words detected:");

        System.out.println("Display of the HashMap object = " + m);
    }
}
