package w6_file_io.exercise;

import java.io.*;
import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        Object obj;
        ArrayList<Student> studentList = new ArrayList<>();
        FileInputStream fi = new FileInputStream("./src/w6_file_io/exercise/students.obj");
        ObjectInputStream studentIn = new ObjectInputStream(fi);
        while (true) {
            try {
                obj = studentIn.readObject();
                studentList.add((Student) obj);
            } catch (EOFException e) {
                System.out.println("Finished reading all the objects!!!");
                break;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        for (Student s: studentList) {
            System.out.println(s.getName() + " " + s.getMajor() + " " + s.getGpa());
        }

        studentIn.close();
    }
}
