/** A pet shop wants to give a discount to its clients if they buy one or more pets and at least five other items. The discount is equal to 20 percent of the cost of the other items, but not the pets. Use a class Item to describe an item, with any needed methods and a constructor
 * public Item(double price, boolean isPet, int quantity)
 * An invoice holds a collection of Item objects; use an array or array list to store them. In the Invoice class, implement methods
 * public void add(Item anItem)
 * public double getDiscount()
 * Write a program that prompts a cashier to enter each price and quantity, and then a Y for a pet or N for another item. Use a price of –1 as a sentinel. In the loop, call the add method; after the loop, call the getDiscount method and display the returned value.
 */

import java.util.Scanner;

/**
 * Prompts the cashier for each item's price, quantity, and pet status,
 * builds an Invoice, and displays the discount the customer qualifies for.
 */
public class InvoiceTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice();

        while (true) {
            System.out.print("Enter price (-1 to stop): ");
            double price = scanner.nextDouble();
            if (price == -1) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Is this a pet? (Y/N): ");
            String answer = scanner.next();
            boolean isPet = answer.equalsIgnoreCase("Y");

            invoice.add(new Item(price, isPet, quantity));
        }

        double discount = invoice.getDiscount();
        System.out.println("Discount: " + discount);
    }
}
