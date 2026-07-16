/** Magic squares. An n × n matrix that is filled with the numbers
 * 1, 2, 3, . . ., n2 is a magic square if the sum of the elements in each row,
 * in each column, and in the two diagonals is the same value.
 * Write a program that reads in 16 values from the keyboard and tests
 * whether they form a magic square when put into a 4 × 4 array.
 * You need to test two features:
 * 1. Does each of the numbers 1, 2, ..., 16 occur in the user input?
 * 2. When the numbers are put into a square, are the sums of the rows, columns,
 * and diagonals equal to each other?
 */

import java.util.Scanner;

/**
 * Reads 16 numbers from the user, arranges them into a 4x4 grid,
 * and checks whether they form a magic square.
 */
public class MagicSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] square = new int[4][4];

        System.out.println("Enter 16 numbers (1 through 16), one at a time:");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                square[row][col] = scanner.nextInt();
            }
        }

        if (hasAllNumbers(square) && hasEqualSums(square)) {
            System.out.println("This is a magic square.");
        } else {
            System.out.println("This is not a magic square.");
        }
    }

    //Checks that every number from 1 to 16 appears exactly once in the square.
    public static boolean hasAllNumbers(int[][] square) {
        boolean[] found = new boolean[17]; // index 0 unused

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                int value = square[row][col];
                if (value < 1 || value > 16 || found[value]) {
                    return false;
                }
                found[value] = true;
            }
        }
        return true;
    }

    //Checks that all rows, columns, and both diagonals add up to the same sum.
    public static boolean hasEqualSums(int[][] square) {
        int n = square.length;
        int target = 0;
        for (int col = 0; col < n; col++) {
            target += square[0][col];
        }

        for (int row = 0; row < n; row++) {
            int sum = 0;
            for (int col = 0; col < n; col++) {
                sum += square[row][col];
            }
            if (sum != target) {
                return false;
            }
        }

        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < n; row++) {
                sum += square[row][col];
            }
            if (sum != target) {
                return false;
            }
        }

        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < n; i++) {
            diagonal1 += square[i][i];
            diagonal2 += square[i][n - 1 - i];
        }
        if (diagonal1 != target || diagonal2 != target) {
            return false;
        }

        return true;
    }
}
