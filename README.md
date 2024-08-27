## Exercise: Interfaces - Inventory Management

#### Objective:

Practice working with interfaces in Java by creating an inventory management system.

#### Description:

You should create an interface called InventoryItem with methods for managing items in an inventory system. Implement two classes, Product and Equipment, both of which implement the InventoryItem interface. Additionally, create a class InventoryManager to manage the inventory.

#### Guidelines:

#### InventoryItem Interface:

Create an interface called InventoryItem with the following methods:

- addToInventory - to add items to the inventory.
- removeFromInventory - to remove items from the inventory.
- getAvailableQuantity - to get the available quantity of the item.

#### Product Class:

Create a class called Product that implements the InventoryItem interface.
Include instance variables for the product name, unit price, and available quantity.

#### Implement the methods:

- addToInventory - Add the specified quantity of products to the inventory.
- removeFromInventory - Remove the specified quantity of products from the inventory.
- getAvailableQuantity - Return the available quantity of the product.

#### Equipment Class:

Create a class called Equipment that also implements the InventoryItem interface.
Include instance variables for the equipment name, purchase price, and available quantity.

#### Implement the methods:

- addToInventory - Add the specified quantity of equipment items to the inventory.
- removeFromInventory - Remove the specified quantity of equipment items from the inventory.
- getAvailableQuantity - Return the available quantity of the equipment.

#### InventoryManager Class:

Create a class called InventoryManager that maintains a list of InventoryItem items.
Include methods to add items to the inventory, remove items from the inventory, and display the available quantities of all items.
