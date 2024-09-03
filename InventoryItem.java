public interface InventoryItem {
    void addToInventory(int quantity);
    void removeFromInventory(int quantity);
    int getAvailableQuantity();
    String getInventoryItemName();
}
