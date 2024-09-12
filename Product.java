public class Product implements InventoryItem {
    private final String productName;
    private final double unitPrice;
    private int availableQuantity;

    public Product(String productName, double unitPrice, int initialQuantity) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        if (unitPrice < 0) {
            throw new IllegalArgumentException("Unit price cannot be negative.");
        }
        if (initialQuantity < 0) {
            throw new IllegalArgumentException("Initial quantity cannot be negative.");
        }
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.availableQuantity = initialQuantity;
    }

    @Override
    public void addToInventory(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity to add must be positive.");
        }
        availableQuantity += quantity;
        System.out.println(quantity + " units of " + productName + " added to inventory.");
    }

    @Override
    public void removeFromInventory(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity to remove must be positive.");
        }
        if (quantity > availableQuantity) {
            throw new IllegalArgumentException("Cannot remove more units than available in inventory.");
        }
        availableQuantity -= quantity;
        System.out.println(quantity + " units of " + productName + " removed from inventory.");
    }

    @Override
    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public String getInventoryItemName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
