package w06_file_io.sample_code.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class TestSerializeRead {
    public static void main(String args[]) throws Exception {
        // Note the use of decorator pattern (ObjectInputStream decorates FileInputStream)
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("./src/w6_file_io/sample_code/students.dat"));

        // The warning is unavoidable (language/API design issue) but we apply it only to a single line
        @SuppressWarnings("unchecked")
        List<Student> students = (List<Student>) in.readObject();

        in.close();

        for (Student student : students) {
            // note implicit call to toString()
            System.out.println(student);
        }
    }
}
