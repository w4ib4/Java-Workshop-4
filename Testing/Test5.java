package Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void testProductValidation() {
        Product product = new Product("Laptop", 1000.0, 2);

        assertAll(
            // Verify that the name is not null
            () -> assertNotNull(product.getName(), "Name should not be null"),

            // Verify that the price is positive
            () -> assertTrue(product.getPrice() > 0, "Price should be positive"),

            // Verify the isAffordable method
            () -> assertTrue(product.isAffordable(2500.0), "Should be affordable within the budget"),
            () -> assertFalse(product.isAffordable(1500.0), "Should not be affordable within the budget")
        );
    }
}
