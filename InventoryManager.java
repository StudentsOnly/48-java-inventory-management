import java.util.HashSet;

public class InventoryManager {
    HashSet<InventoryItem> items;

    public InventoryManager() {
        this.items = new HashSet<>();
    }

    public void addItemToInventory(InventoryItem item) {
        if (items.add(item)) {
            System.out.println("Item was added");
        } else {
            getItemByName(item.getName()).addToInventory(item.getAvailableQuantity());
            System.out.println("Amount of " + item.getName() + "'s was increased");
        }
    }

    public InventoryItem getItemByName(String name) {
        for (InventoryItem inventoryItem : items) {
            if (inventoryItem.getName().equals(name)) {
                return inventoryItem;
            }
        }
        return null;
    }


    public void removeItemFromInventory(String name, int quantity) {
        InventoryItem item = getItemByName(name);
        if (item != null) {
            if (item.removeFromInventory(quantity)) {
                System.out.println("Amount of " + item.getName() + "'s was decreased");
            } else System.out.println("Something is wrong");
        } else System.out.println("No such item");
    }

    public void displayInfo() {
        items.forEach(System.out::println);
    }
}
