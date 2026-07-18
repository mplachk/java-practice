/** A pet shop wants to give a discount to its clients if they buy one or more pets and at least five other items. The discount is equal to 20 percent of the cost of the other items, but not the pets. Use a class Item to describe an item, with any needed methods and a constructor
 * public Item(double price, boolean isPet, int quantity)
 * An invoice holds a collection of Item objects; use an array or array list to store them. In the Invoice class, implement methods
 * public void add(Item anItem)
 * public double getDiscount()
 * Write a program that prompts a cashier to enter each price and quantity, and then a Y for a pet or N for another item. Use a price of –1 as a sentinel. In the loop, call the add method; after the loop, call the getDiscount method and display the returned value.
 */

/**
 * Represents an item on an invoice: a price, a quantity, and whether
 * it's a pet.
 */
public class Item {

    private double price;
    private boolean isPet;
    private int quantity;

    /** Creates an Item with the given price, pet status, and quantity. */
    public Item(double price, boolean isPet, int quantity) {
        this.price = price;
        this.isPet = isPet;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPet() {
        return isPet;
    }

    public int getQuantity() {
        return quantity;
    }

    /** Returns the total cost of this item (price times quantity). */
    public double getTotalCost() {
        return price * quantity;
    }
}
