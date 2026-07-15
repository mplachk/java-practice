import java.util.Scanner;

/**
 * Reads one hundred terrain height values into a 10x10 grid and
 * prints flood maps showing the terrain at ten increasing water
 * levels, from the lowest point to the highest.
 */
public class TerrainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heights = new double[10][10];

        System.out.println("Enter 100 height values:");
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                heights[row][col] = scanner.nextDouble();
            }
        }

        Terrain terrain = new Terrain(heights);
        double min = terrain.getMinHeight();
        double max = terrain.getMaxHeight();
        double step = (max - min) / 9;

        for (int i = 0; i < 10; i++) {
            double waterLevel = min + step * i;
            System.out.println("\nWater level: " + waterLevel);
            terrain.printFloodMap(waterLevel);
        }
    }
}
