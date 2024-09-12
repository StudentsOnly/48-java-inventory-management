public class Main {
    public static void main(String[] args) {
        try {

            Product laptop = new Product("Laptop", 1000.00, 10);
            Equipment projector = new Equipment("Projector", 500.00, 5);

            InventoryManager manager = new InventoryManager();
            manager.addItem(laptop);
            manager.addItem(projector);

            System.out.println("Initial inventory:");
            manager.displayAllItems();

            try {
                laptop.addToInventory(5);
                projector.addToInventory(2);
            } catch (IllegalArgumentException e) {
                System.out.println("Error adding items to inventory: " + e.getMessage());
            }

            try {
                manager.removeItemFromInventory("Laptop", 3);
                manager.removeItemFromInventory("Projector", 1);
            } catch (IllegalArgumentException e) {
                System.out.println("Error removing items from inventory: " + e.getMessage());
            }

            System.out.println("Updated inventory:");
            manager.displayAllItems();

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
