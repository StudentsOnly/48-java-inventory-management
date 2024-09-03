import java.util.Objects;

public class Product implements InventoryItem {
    private String name;
    private double unitPrice;
    private int quantity;

    public Product(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public boolean addToInventory(int amount) {
        if (amount <= 0) return false;
        else {
            quantity += amount;
            return true;
        }
    }

    @Override
    public boolean removeFromInventory(int amount) {
        if (amount <= 0) return false;
        if (quantity - amount < 0) return false;
        else {
            quantity -= amount;
            return true;
        }
    }

    @Override
    public int getAvailableQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Product " + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity;
    }
}
