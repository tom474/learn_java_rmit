package w11_exception_handling.exercise4;

public class MarkException extends RMITException {
    public MarkException(String str) {
        super("Exceptions related to mark: " + str);
    }
}
