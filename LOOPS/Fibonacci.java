/** The Fibonacci numbers are defined by the sequence
 * f1 = 1
 * f2 = 1
 * fn = fn–1 + fn–2
 * Reformulate that as
 * fold1 = 1;
 * fold2 = 1;
 * fnew = fold1 + fold2;
 * After that, discard fold2, which is no longer needed, and set fold2 to fold1 and fold1 to
 * fnew. Repeat an appropriate number of times.
 * Implement a program that prompts the user for an integer n and prints the nth
 * Fibonacci number, using the above algorithm.
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int fold1 = 1;
        int fold2 = 1;
        int fnew = 1;

        for (int i = 3; i <= n; i++) {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
        }

        System.out.println(fnew);
    }
}
