package w5_oop_basics_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("First String");
        set.add("Second String");
        set.add(new MyOwnClass());
        set.add(new MyOwnClass());
        set.add(4);
        set.add(5);
        set.add(13);

        Iterator c = set.iterator();
        while (c.hasNext()) {
            System.out.println(c.next());

        }

        System.out.println();
        set.forEach(e -> System.out.println(e));

        String name[] = {
                new String("Minh"),
                new String("Hai"),
                new String("Hoa"),
                new String("Hai"),
        };

        Set s = new HashSet();
        ArrayList l = new ArrayList();
        for (int i = 0; i< name.length; i++) {
            if (!s.add(name[i])) {
                System.out.println("Duplicate detected: " + name[i]);
                l.add(name[i]);
            }
        }

        System.out.println();
        System.out.println("Our set is " + s);
        System.out.println();
        System.out.println("Our list is " + l);
    }
}

class MyOwnClass {}
