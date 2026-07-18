// Write programs with loops that compute

import java.util.Scanner;

public class LoopExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sum of even numbers 2-100: " + sumEven());
        System.out.println("Sum of squares 1-100: " + sumSquares());

        System.out.println("Powers of 2 from 2^0 to 2^20:");
        printPowersOfTwo();

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Sum of odd numbers between a and b: " + sumOdd(a, b));

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of odd digits: " + sumOddDigits(number));
    }

    // a. The sum of all even numbers between 2 and 100 (inclusive).
    public static int sumEven() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    // b. The sum of all squares between 1 and 100 (inclusive).
    public static int sumSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }

    // c. All powers of 2 from 2^0 up to 2^20.
    public static void printPowersOfTwo() {
        for (long power = 1; power <= 1048576; power *= 2) {
            System.out.println(power);
        }
    }

    // d. The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
    public static int sumOdd(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // e. The sum of all odd digits of an input.
    public static int sumOddDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}