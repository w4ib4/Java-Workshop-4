package Testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

class StringManipulatorTest {
    @Test
    void testStringManipulator() {
        StringManipulator manipulator = new StringManipulator();

        assertAll(
            () -> assertEquals("najirs", manipulator.reverse("srijan"), "Reverse"),
            () -> assertEquals("NAJIRS", manipulator.toUpperCase("srijan"), "ToUpperCase "),
            () -> assertTrue(manipulator.isPalindrome("madam"), "Palindrome check"),
            () -> assertEquals(2, manipulator.countVowels("srijan"), "Vowel count")
        );
    }
}
public class Test9 {

}
