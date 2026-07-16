/**
 * Tests each method of the ArrayMethods class.
 */
public class ArrayMethodsTest {

    public static void main(String[] args) {
        ArrayMethods a = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        a.swapFirstAndLast();
        System.out.println("swapFirstAndLast: " + java.util.Arrays.toString(a.getValues()));
        // expected: [25, 4, 9, 16, 1]

        ArrayMethods b = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        b.shiftRight();
        System.out.println("shiftRight: " + java.util.Arrays.toString(b.getValues()));
        // expected: [25, 1, 4, 9, 16]

        ArrayMethods c = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        c.replaceEvenWithZero();
        System.out.println("replaceEvenWithZero: " + java.util.Arrays.toString(c.getValues()));
        // expected: [1, 0, 9, 0, 25]

        ArrayMethods d = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        d.replaceWithLargerNeighbor();
        System.out.println("replaceWithLargerNeighbor: " + java.util.Arrays.toString(d.getValues()));
        // expected: [1, 9, 16, 25, 25]

        ArrayMethods e1 = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        e1.removeMiddle();
        System.out.println("removeMiddle (odd): " + java.util.Arrays.toString(e1.getValues()));
        // expected: [1, 4, 16, 25]

        ArrayMethods e2 = new ArrayMethods(new int[]{1, 4, 9, 16, 25, 36});
        e2.removeMiddle();
        System.out.println("removeMiddle (even): " + java.util.Arrays.toString(e2.getValues()));
        // expected: [1, 4, 25, 36]

        ArrayMethods f = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        f.moveEvensToFront();
        System.out.println("moveEvensToFront: " + java.util.Arrays.toString(f.getValues()));
        // expected: [4, 16, 1, 9, 25]

        ArrayMethods g = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        System.out.println("secondLargest: " + g.secondLargest());
        // expected: 16

        ArrayMethods h1 = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        System.out.println("isSorted (sorted): " + h1.isSorted());
        // expected: true

        ArrayMethods h2 = new ArrayMethods(new int[]{1, 9, 4, 16, 25});
        System.out.println("isSorted (not sorted): " + h2.isSorted());
        // expected: false

        ArrayMethods i1 = new ArrayMethods(new int[]{1, 4, 4, 16, 25});
        System.out.println("hasAdjacentDuplicates: " + i1.hasAdjacentDuplicates());
        // expected: true

        ArrayMethods i2 = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        System.out.println("hasAdjacentDuplicates: " + i2.hasAdjacentDuplicates());
        // expected: false

        ArrayMethods j1 = new ArrayMethods(new int[]{1, 4, 9, 16, 4});
        System.out.println("hasDuplicates: " + j1.hasDuplicates());
        // expected: true

        ArrayMethods j2 = new ArrayMethods(new int[]{1, 4, 9, 16, 25});
        System.out.println("hasDuplicates: " + j2.hasDuplicates());
        // expected: false
    }
}
