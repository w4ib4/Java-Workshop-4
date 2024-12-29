package Testing;

import java.util.HashMap;
import java.util.Map;

class InventoryManagement {
    private Map<String, Integer> stock = new HashMap<>();

    public void addProduct(String productName, int quantity) {
        stock.put(productName, stock.getOrDefault(productName, 0) + quantity);
    }

    public boolean isProductAvailable(String productName, int quantity) {
        return stock.getOrDefault(productName, 0) >= quantity;
    }
}
public class W4Q6 {

}
