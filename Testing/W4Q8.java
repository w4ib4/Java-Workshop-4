package Testing;

import java.util.HashMap;
import java.util.Map;

class EnrollmentService {
    private Map<String, String> enrollments = new HashMap<>();

    public boolean enrollStudent(String studentUsername, String courseName) {
        if (enrollments.containsKey(studentUsername) && enrollments.get(studentUsername).equals(courseName)) {
            return false;
        }
        enrollments.put(studentUsername, courseName);
        return true;
    }
}
public class W4Q8 {

}
