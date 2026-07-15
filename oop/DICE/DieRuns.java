/**
 * A run is a sequence of adjacent repeated values. Write a program that generates a sequence of 20 random die tosses in an array and that prints the die values, marking the runs by including them in parentheses, like this:
 * 1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1
 * Use the following pseudocode:
 * inRun = false
 * For each valid index i in the array
 * If inRun
 * If values[i] is different from the preceding value
 * Print ).
 * inRun = false
 * If not inRun
 * If values[i] is the same as the following value
 * Print (.
 * inRun = true
 * Print values[i].
 * If inRun, print ).
 */

import java.util.Random;

/**
 * Generates 20 random die tosses and prints them, marking runs of
 * repeated adjacent values with parentheses.
 */
public class DieRuns {

    public static void main(String[] args) {
        Random generator = new Random();
        int[] values = new int[20];

        for (int i = 0; i < values.length; i++) {
            values[i] = generator.nextInt(6) + 1;
        }

        boolean inRun = false;

        for (int i = 0; i < values.length; i++) {
            if (inRun) {
                if (i == 0 || values[i] != values[i - 1]) {
                    System.out.print(") ");
                    inRun = false;
                }
            }

            if (!inRun) {
                if (i < values.length - 1 && values[i] == values[i + 1]) {
                    System.out.print("(");
                    inRun = true;
                }
            }

            System.out.print(values[i] + " ");
        }

        if (inRun) {
            System.out.print(")");
        }

        System.out.println();
    }
}
