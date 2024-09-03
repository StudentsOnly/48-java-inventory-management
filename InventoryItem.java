public interface InventoryItem {
    boolean addToInventory(int amount);

    boolean removeFromInventory(int amount);

    int getAvailableQuantity();

    String getName();

}
