/** 
 * Write a program that generates a sequence of 20 random die tosses in an array and that prints the die values, marking only the longest run, like this:
 * 1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1
 * If there is more than one run of maximum length, mark the first one.
 */

import java.util.Random;

/**
 * Generates 20 random die tosses and prints them, marking only the
 * longest run of adjacent repeated values. Ties are broken by
 * marking the first one.
 */
public class LongestDieRun {

    public static void main(String[] args) {
        Random generator = new Random();
        int[] values = new int[20];

        for (int i = 0; i < values.length; i++) {
            values[i] = generator.nextInt(6) + 1;
        }

        int bestStart = 0;
        int bestLength = 1;

        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                currentLength++;
            } else {
                currentStart = i;
                currentLength = 1;
            }

            if (currentLength > bestLength) {
                bestLength = currentLength;
                bestStart = currentStart;
            }
        }

        int bestEnd = bestStart + bestLength - 1;

        for (int i = 0; i < values.length; i++) {
            if (i == bestStart && bestLength > 1) {
                System.out.print("(");
            }

            System.out.print(values[i]);

            if (i == bestEnd && bestLength > 1) {
                System.out.print(")");
            }

            System.out.print(" ");
        }

        System.out.println();
    }
}
