public class Main {
    public static void main(String[] args) {
        InventoryManager mng = new InventoryManager();
        mng.addItemToInventory(new Product("Microwave", 5.50, 10));
        mng.addItemToInventory(new Product("Microwave", 5.50, 2));
        mng.addItemToInventory(new Equipment("Car", 5000, 3));

        mng.displayInfo();

        mng.removeItemFromInventory("Car", 10);
        mng.displayInfo();
    }

}
