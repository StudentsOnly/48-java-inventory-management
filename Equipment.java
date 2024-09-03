public class Equipment implements InventoryItem {
    private final String equipmentName;
    private final double purchasePrice;
    private int availableQuantity;

    public Equipment(String equipmentName, double purchasePrice, int initialQuantity) {
        this.equipmentName = equipmentName;
        this.purchasePrice = purchasePrice;
        this.availableQuantity = initialQuantity;
    }

    @Override
    public void addToInventory(int quantity) {
        if (quantity > 0) {
            availableQuantity += quantity;
            System.out.println(quantity + " units of " + equipmentName + " added to inventory.");
        } else {
            System.out.println("Cannot add non-positive quantity to inventory.");
        }
    }

    @Override
    public void removeFromInventory(int quantity) {
        if (quantity > 0 && quantity <= availableQuantity) {
            availableQuantity -= quantity;
            System.out.println(quantity + " units of " + equipmentName + " removed from inventory.");
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
        return equipmentName;
    }
}
