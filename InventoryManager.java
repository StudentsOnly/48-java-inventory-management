import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private final List<InventoryItem> inventoryItems;

    public InventoryManager() {
        inventoryItems = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        inventoryItems.add(item);
        System.out.println("Item " + item.getInventoryItemName() + " added to inventory.");
    }

    public void removeItemFromInventory(String itemName, int quantity) {
        for (InventoryItem item : inventoryItems) {
            if (item.getInventoryItemName().equalsIgnoreCase(itemName)) {
                item.removeFromInventory(quantity);
                return;
            }
        }
        System.out.println("Item not found in inventory.");
    }

    public void displayAllItems() {
        for (InventoryItem item : inventoryItems) {
            if (item instanceof Product) {
                System.out.println("Product: " + item.getInventoryItemName() + " - Quantity: " + item.getAvailableQuantity());
            } else if (item instanceof Equipment) {
                System.out.println("Equipment: " + item.getInventoryItemName() + " - Quantity: " + item.getAvailableQuantity());
            }
        }
    }
}
