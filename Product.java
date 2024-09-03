public class Product implements InventoryItem {
    private final String productName;
    private final double unitPrice;
    private int availableQuantity;

    public Product(String productName, double unitPrice, int initialQuantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.availableQuantity = initialQuantity;
    }

    @Override
    public void addToInventory(int quantity) {
        if (quantity > 0) {
            availableQuantity += quantity;
            System.out.println(quantity + " units of " + productName + " added to inventory.");
        } else {
            System.out.println("Cannot add non-positive quantity to inventory.");
        }
    }

    @Override
    public void removeFromInventory(int quantity) {
        if (quantity > 0 && quantity <= availableQuantity) {
            availableQuantity -= quantity;
            System.out.println(quantity + " units of " + productName + " removed from inventory.");
        } else {
            System.out.println("Cannot remove the specified quantity from inventory.");
        }
    }

    @Override
    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public String getInventoryItemName() {
        return productName;
    }
}
