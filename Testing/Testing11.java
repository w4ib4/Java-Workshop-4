package Testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {
    LibraryService library;

    @BeforeAll
    static void setupGlobal() {
        System.out.println("Global setup");
    }

    @AfterAll
    static void cleanupGlobal() {
        System.out.println("Global cleanup");
    }

    @BeforeEach
    void setup() {
        library = new LibraryService();
    }

    @AfterEach
    void cleanup() {
        System.out.println("Test completed");
    }

    @Test
    void testAddAndSearchBook() {
        library.addBook("Atomic Habits");
        assertTrue(library.searchBook("Atomic Habits"), "Book should be found");
        assertFalse(library.searchBook("Crime and Punishment"), "Book should not be found");
    }
}

public class Testing11 {

}
