package Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementTest {
    @Test
    void testIsProductAvailable() {
        InventoryManagement inventory = new InventoryManagement();
        inventory.addProduct("Laptop", 10);

        assertAll(
            () -> assertTrue(inventory.isProductAvailable("Laptop", 5), "Laptop should be available"),
            () -> assertFalse(inventory.isProductAvailable("Laptop", 15), "Laptop should not be available")
        );
    }
}

public class Test6 {

}
