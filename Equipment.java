public class Equipment implements InventoryItem {
    private final String equipmentName;
    private final double purchasePrice;
    private int availableQuantity;

    public Equipment(String equipmentName, double purchasePrice, int initialQuantity) {
        if (equipmentName == null || equipmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Equipment name cannot be null or empty.");
        }
        if (purchasePrice < 0) {
            throw new IllegalArgumentException("Purchase price cannot be negative.");
        }
        if (initialQuantity < 0) {
            throw new IllegalArgumentException("Initial quantity cannot be negative.");
        }
        this.equipmentName = equipmentName;
        this.purchasePrice = purchasePrice;
        this.availableQuantity = initialQuantity;
    }

    @Override
    public void addToInventory(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity to add must be positive.");
        }
        availableQuantity += quantity;
        System.out.println(quantity + " units of " + equipmentName + " added to inventory.");
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
        System.out.println(quantity + " units of " + equipmentName + " removed from inventory.");
    }

    @Override
    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public String getInventoryItemName() {
        return equipmentName;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }
}
