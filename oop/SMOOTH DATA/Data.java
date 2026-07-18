/** Sample values from an experiment often need to be smoothed out. One simple
 * approach is to replace each value in an array with the average of the value and its two
 * neighboring values (or one neighboring value if it is at either end of the array). Given
 * a class Data with instance fields
 * private double[] values;
 * private double valuesSize;
 * implement a method
 * public void smooth()
 * that carries out this operation. You should not create another array in your solution.
 */

/**
 * Represents a collection of experimental data values that can
 * be smoothed by averaging each value with its neighbors.
 */
public class Data {

    private double[] values;
    private double valuesSize;

    /**
     * Creates a Data object from the given array.
     */
    public Data(double[] values) {
        this.values = values;
        this.valuesSize = values.length;
    }

    public double[] getValues() {
        return values;
    }

    /**
     * Smooths each value in place by averaging it with its neighbors,
     * without allocating a second array.
     */
    public void smooth() {
        int size = (int) valuesSize;
        double previous = values[0];

        for (int i = 0; i < size; i++) {
            double current = values[i];
            double next = (i < size - 1) ? values[i + 1] : current;

            double sum = current;
            int count = 1;

            if (i > 0) {
                sum += previous;
                count++;
            }
            if (i < size - 1) {
                sum += next;
                count++;
            }

            previous = current;
            values[i] = sum / count;
        }
    }
}
