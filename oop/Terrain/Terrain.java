/**
 * You are given a two-dimensional array of values that give the height of a terrain at different points in a square. Write a constructor public Terrain(double[][] heights) and a method public void printFloodMap(double waterLevel) that prints out a flood map, showing which of the points in the terrain would be flooded if the water level was the given value. In the flood map, print a * for each flooded point and a space for each point that is not flooded.
 * Here is a sample map:
  * * * * 	        	* *
  * * * * *           * * *
  * * * *	            * *
  * * *	              * * *
  * * * *         *   * * *
  * * * * * * * * * *
  * *      * * *
  *        * * * *        *
                        * *
                      * * *

 * Then write a program that reads one hundred terrain height values and shows how the terrain gets flooded when the water level increases in ten steps from the lowest point in the terrain to the highest.
 */


/**
 * Represents a terrain as a grid of height values and can print
 * a flood map showing which points would be underwater at a
 * given water level.
 */
public class Terrain {

    private double[][] heights;

    /**
     * Creates a Terrain from the given grid of height values.
     */
    public Terrain(double[][] heights) {
        this.heights = heights;
    }

    /**
     * Prints a map marking each flooded point with * and each
     * dry point with a space, for the given water level.
     */
    public void printFloodMap(double waterLevel) {
        for (int row = 0; row < heights.length; row++) {
            for (int col = 0; col < heights[row].length; col++) {
                if (heights[row][col] <= waterLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Returns the lowest height value in the terrain.
     */
    public double getMinHeight() {
        double min = heights[0][0];
        for (int row = 0; row < heights.length; row++) {
            for (int col = 0; col < heights[row].length; col++) {
                if (heights[row][col] < min) {
                    min = heights[row][col];
                }
            }
        }
        return min;
    }

    /**
     * Returns the highest height value in the terrain.
     */
    public double getMaxHeight() {
        double max = heights[0][0];
        for (int row = 0; row < heights.length; row++) {
            for (int col = 0; col < heights[row].length; col++) {
                if (heights[row][col] > max) {
                    max = heights[row][col];
                }
            }
        }
        return max;
    }
}
