package w10_exception_handling.exercise4;

import java.util.HashMap;
import java.util.Map;

public class RMITStudent {
    private String name;
    private Map<String, Integer> marks;

    public RMITStudent(String name) {
        this.name = name;
        this.marks = new HashMap<String, Integer>();
    }

    public void updateCourse(String code, int mark) throws MarkException, CourseException {
        if (mark < 0 || mark > 100) {
            throw new MarkException("Invalid mark");
        }
        marks.put(code, mark);
        if (marks.size() > 3) {
            throw new CourseException("Exceed limit");
        }
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (String code: marks.keySet()) {
            sb.append("\n");
            sb.append(code + ": ");
            sb.append(marks.get(code));
        }
        return sb.toString();
    }
}
