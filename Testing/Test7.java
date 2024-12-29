package Testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NotificationServiceTest {
    @Test
    void testSendEmail() {
        NotificationService service = new NotificationService();

        assertAll(
            () -> assertTrue(service.sendEmail("srijanxwaiba@icloud.com", "Namaste"), "Valid email should pass"),
            () -> assertFalse(service.sendEmail("invalid email", "Hello"), "Invalid email should fail")
        );
    }
}
public class Test7 {

}
