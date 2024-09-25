package w10_exception_handling.exercise4;

public class Exercise4 {
    public static void main(String args[]) throws MarkException, CourseException {
        RMITStudent s1 = new RMITStudent("Minh");
        s1.updateCourse("COSC2081", 80);
        s1.updateCourse("INTE2512", 75);
        s1.updateCourse("COSC2081", 83);
        System.out.println(s1);
        s1.updateCourse("COSC2440", 84);
        System.out.println(s1);
        s1.updateCourse("COSC2083", 83);
        // s1.updateCourse("COSC2085", 105);
    }
}
