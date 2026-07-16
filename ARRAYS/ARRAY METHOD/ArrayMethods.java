/** E7.11
 * Write array methods that carry out the following tasks for an array of integers by
 * completing the ArrayMethods class below. For each method, provide a test program.
 * public class ArrayMethods
 * {
 * private int[] values;
 * public ArrayMethods(int[] initialValues) { values = initialValues; }
 * public void swapFirstAndLast() { . . . }
 * public void shiftRight() { . . . }
 * . . .
 * }
 */

import java.util.Arrays;

/**
 * A collection of array manipulation and query methods.
 */
public class ArrayMethods {

    private int[] values;

    public ArrayMethods(int[] initialValues) {
        values = initialValues;
    }

    public int[] getValues() {
        return values;
    }

//a. Swap the first and last elements in the array.
    public void swapFirstAndLast() {
        int last = values.length - 1;
        int temp = values[0];
        values[0] = values[last];
        values[last] = temp;
    }
//b. Shift all elements to the right by one and move the last element into the first position. 
//For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
    public void shiftRight() {
        int last = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = last;
    }

//c. Replace all even elements with 0.
    public void replaceEvenWithZero() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                values[i] = 0;
            }
        }
    }

//d. Replace each element except the first and last by the larger of its two neighbors.
    public void replaceWithLargerNeighbor() {
        int[] result = new int[values.length];
        result[0] = values[0];
        result[values.length - 1] = values[values.length - 1];

        for (int i = 1; i < values.length - 1; i++) {
            result[i] = Math.max(values[i - 1], values[i + 1]);
        }
        values = result;
    }
//e. Remove the middle element if the array length is odd, or the middle two elements if the length is even.
    public void removeMiddle() {
        int removeCount = (values.length % 2 == 0) ? 2 : 1;
        int startRemove = (values.length - removeCount) / 2;

        int[] result = new int[values.length - removeCount];
        int j = 0;
        for (int i = 0; i < values.length; i++) {
            if (i < startRemove || i >= startRemove + removeCount) {
                result[j] = values[i];
                j++;
            }
        }
        values = result;
    }

//f. Move all even elements to the front, otherwise preserving the order of the Elements.
    public void moveEvensToFront() {
        int[] result = new int[values.length];
        int j = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                result[j] = values[i];
                j++;
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) {
                result[j] = values[i];
                j++;
            }
        }
        values = result;
    }

//g. Return the second-largest element in the array.
    public int secondLargest() {
        int largest = Math.max(values[0], values[1]);
        int second = Math.min(values[0], values[1]);

        for (int i = 2; i < values.length; i++) {
            if (values[i] > largest) {
                second = largest;
                largest = values[i];
            } else if (values[i] > second) {
                second = values[i];
            }
        }
        return second;
    }

//h. Return true if the array is currently sorted in increasing order.
    public boolean isSorted() {
        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[i - 1]) {
                return false;
            }
        }
        return true;
    }

//i. Return true if the array contains two adjacent duplicate elements.
    public boolean hasAdjacentDuplicates() {
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                return true;
            }
        }
        return false;
    }

//j. Return true if the array contains duplicate elements (which need not be adjacent).
    public boolean hasDuplicates() {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
