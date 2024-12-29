package Testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class EnrollmentServiceTest {
    @Test
    void testEnrollStudent() {
        EnrollmentService service = new EnrollmentService();

        assertAll(
            () -> assertTrue(service.enrollStudent("Srijan", "JAVA"), "Should allow enrollment"),
            () -> assertFalse(service.enrollStudent("Srijan", "JAVA"), "Should not allow in the same course")
        );
    }
}

public class Test8 {

}
