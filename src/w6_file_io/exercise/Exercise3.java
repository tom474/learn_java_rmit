package w6_file_io.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream of = new FileOutputStream("./src/w6_file_io/exercise/students.obj");
        ObjectOutputStream studentOut = new ObjectOutputStream(of);
        Student s1 = new Student("John", "CS", 8.5);
        studentOut.writeObject(s1);
        Student s2 = new Student("Adam", "CS", 7.5);
        studentOut.writeObject(s2);
        studentOut.close();
    }
}
