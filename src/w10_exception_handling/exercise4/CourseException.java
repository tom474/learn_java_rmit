package w10_exception_handling.exercise4;

public class CourseException extends RMITException {
    public CourseException(String str) {
        super("Exceptions related to course: " + str);
    }
}
