import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private final List<InventoryItem> inventoryItems;

    public InventoryManager() {
        inventoryItems = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        inventoryItems.add(item);
        System.out.println("Item " + item.getInventoryItemName() + " added to inventory.");
    }

    public void removeItemFromInventory(String itemName, int quantity) {
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }

        boolean itemFound = false;

        for (InventoryItem item : inventoryItems) {
            if (item.getInventoryItemName().equalsIgnoreCase(itemName)) {
                itemFound = true;
                try {
                    item.removeFromInventory(quantity);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error removing item: " + e.getMessage());
                }
                return;
            }
        }

        if (!itemFound) {
            System.out.println("Item not found in inventory.");
        }
    }

    public void displayAllItems() {
        if (inventoryItems.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (InventoryItem item : inventoryItems) {
            if (item instanceof Product) {
                System.out.println("Product: " + item.getInventoryItemName() + " - Quantity: " + item.getAvailableQuantity());
            } else if (item instanceof Equipment) {
                System.out.println("Equipment: " + item.getInventoryItemName() + " - Quantity: " + item.getAvailableQuantity());
            }
        }
    }
}
