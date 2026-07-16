/** Modify the LargestInArray.java program in Section 7.3.10 to mark both the smallest
 * and the largest elements.
 */

public class LargestInArray {
    public static void main(String[] args) {
        int[] values = { 17, 4, 32, 8, 55, 3, 19 };

        int largestIndex = 0;
        int smallestIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[largestIndex]) {
                largestIndex = i;
            }
            if (values[i] < values[smallestIndex]) {
                smallestIndex = i;
            }
        }

        for (int i = 0; i < values.length; i++) {
            if (i == largestIndex) {
                System.out.print("[" + values[i] + "] ");
            } else if (i == smallestIndex) {
                System.out.print("<" + values[i] + "> ");
            } else {
                System.out.print(values[i] + " ");
            }
        }
        System.out.println();
    }
}
