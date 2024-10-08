package w06_file_io.sample_code.serialization;

import java.io.Serializable;

public class Committee implements Serializable {
    private int number = 0;
    // Uncomment to test transient keyword
    // private transient int number = 0;
    private String name;

    public Committee(String name) {
        this.name = name;
    }

    public void increment() {
        number++;
    }

    // String.format would make more sense here but since we are introducing StringBuilder!
    @Override
    public String toString() {
        // See API for thread safe equivalent java.lang.StringBuffer
        return new StringBuilder().append("Committee: ").append(name).append(", Number = ").append(number).toString();
    }
}
