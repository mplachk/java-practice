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
