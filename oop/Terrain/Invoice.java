import java.util.ArrayList;

/**
 * Holds a collection of Items and calculates the discount a customer
 * qualifies for.
 */
public class Invoice {

    private ArrayList<Item> items;

    /** Creates an Invoice with no items. */
    public Invoice() {
        items = new ArrayList<Item>();
    }

    /** Adds an item to the invoice. */
    public void add(Item anItem) {
        items.add(anItem);
    }

    /**
     * Returns the discount: 20% of the cost of non-pet items, but only
     * if the invoice has at least one pet and at least five non-pet
     * items (by total quantity).
     */
    public double getDiscount() {
        boolean hasPet = false;
        int nonPetQuantity = 0;
        double nonPetCost = 0;

        for (Item item : items) {
            if (item.isPet()) {
                hasPet = true;
            } else {
                nonPetQuantity += item.getQuantity();
                nonPetCost += item.getTotalCost();
            }
        }

        if (hasPet && nonPetQuantity >= 5) {
            return 0.20 * nonPetCost;
        }
        return 0;
    }
}
