package w6_file_io.sample_code.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestSerializeWrite {
    public static void main(String args[]) throws IOException {
        List<Student> students = new ArrayList<>();
        Committee c1 = new Committee("Student Union");

        Student s1 = new Student("Jane Doe", "s1234");
        s1.add("FP");
        s1.add("ECES");
        s1.add("Enterprise Systems");
        s1.set(c1);
        students.add(s1);
        Student s2 = new Student("John Doe", "s1235");
        s2.add("MAD");
        s2.add("Web Services");
        s2.add("FP");
        s2.set(c1);
        students.add(s2);

        // Note the use of decorator pattern (ObjectOutputStream decorates FileOutputStream)
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./src/w6_file_io/sample_code/students.dat"));

        // Writing the student collection recursively writes the entire object graph
        // i.e. the Committees and all other refs
        out.writeObject(students);
        out.close();
    }
}
