/** Write a program that initializes an array with ten random integers and then prints
 * four lines of output, containing
 * • Every element at an even index.
 * • Every even element.
 * • All elements in reverse order.
 * • Only the first and last element.
 */ 

import java.util.Random;

public class ArrayPrinting {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            values[i] = generator.nextInt(100);
        }

        System.out.print("Even index: ");
        for (int i = 0; i < values.length; i += 2) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        System.out.print("Even elements: ");
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                System.out.print(values[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Reverse order: ");
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        System.out.println("First and last: " + values[0] + " " + values[values.length - 1]);
    }
}
