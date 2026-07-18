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

public class DataTest {
    public static void main(String[] args) {
        Data data = new Data(new double[]{ 1, 2, 3, 4, 100 });
        data.smooth();

        double[] result = data.getValues();
        for (double value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
