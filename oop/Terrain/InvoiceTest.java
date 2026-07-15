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
