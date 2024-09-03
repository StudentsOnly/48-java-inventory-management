public class Main {
    public static void main(String[] args) {
        // Create instances of Product and Equipment
        Product laptop = new Product("Laptop", 1000.00, 10);
        Equipment projector = new Equipment("Projector", 500.00, 5);

        // Create an InventoryManager and add items to it
        InventoryManager manager = new InventoryManager();
        manager.addItem(laptop);
        manager.addItem(projector);

        // Display all items
        manager.displayAllItems();

        // Add to inventory
        laptop.addToInventory(5);
        projector.addToInventory(2);

        // Remove from inventory
        manager.removeItemFromInventory("Laptop", 3);
        manager.removeItemFromInventory("Projector", 1);

        // Display all items again
        manager.displayAllItems();
    }
}
