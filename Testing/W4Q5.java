package Testing;
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAffordable(double budget) {
        return price * quantity <= budget;
    }
}

public class W4Q5 {
	public static void main(String[] args) {
		
	}

}
