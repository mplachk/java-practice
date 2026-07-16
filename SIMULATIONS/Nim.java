/** The game of Nim. This is a well-known game with a number of variants. The fol-
 * lowing variant has an interesting winning strategy. Two players alternately take
 * marbles from a pile. In each move, a player chooses how many marbles to take. The
 * player must take at least one but at most half of the marbles. Then the other player
 * takes a turn. The player who takes the last marble loses.
 * Write a program in which the computer plays against a human opponent. Generate a
 * random integer between 10 and 100 to denote the initial size of the pile. Generate a
 * random integer between 0 and 1 to decide whether the computer or the human takes
 * the first turn. Generate a random integer between 0 and 1 to decide whether the
 * computer plays smart or stupid. In stupid mode the computer simply takes a random
 * legal value (between 1 and n/2) from the pile whenever it has a turn. In smart mode
 * the computer takes off enough marbles to make the size of the pile a power of two
 * minus 1—that is, 3, 7, 15, 31, or 63. That is always a legal move, except when the size
 * of the pile is currently one less than a power of two. In that case, the computer makes
 * a random legal move.
 * You will note that the computer cannot be beaten in smart mode when it has the first
 * move, unless the pile size happens to be 15, 31, or 63. Of course, a human player who
 * has the first turn and knows the win ning strategy can win against the computer.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Plays the game of Nim against a human. Players alternately remove
 * between 1 and half the pile; whoever takes the last marble loses.
 * The computer can play "smart" (aiming for a pile size of 2^k - 1)
 * or "stupid" (a random legal move).
 */
public class Nim {

    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);

        int pile = 10 + generator.nextInt(91);
        boolean computerTurn = generator.nextInt(2) == 0;
        boolean smart = generator.nextInt(2) == 0;

        System.out.println("Starting pile: " + pile);
        System.out.println("Computer plays " + (smart ? "smart" : "stupid") + " mode.");
        System.out.println((computerTurn ? "Computer" : "You") + " will go first.");

        while (pile > 1) {
            System.out.println("\nMarbles remaining: " + pile);

            int taken;
            if (computerTurn) {
                taken = smart ? smartMove(pile, generator) : stupidMove(pile, generator);
                System.out.println("Computer takes " + taken + ".");
            } else {
                taken = humanMove(pile, scanner);
            }

            pile -= taken;
            computerTurn = !computerTurn;
        }

        System.out.println("\nOne marble left.");
        System.out.println((computerTurn ? "Computer" : "You") + " must take it and lose.");
        System.out.println((computerTurn ? "You win!" : "Computer wins!"));
    }

    /** Prompts the human for a legal move and validates it. */
    public static int humanMove(int pile, Scanner scanner) {
        int max = pile / 2;
        int taken;
        while (true) {
            System.out.print("Take how many (1 to " + max + "): ");
            taken = scanner.nextInt();
            if (taken >= 1 && taken <= max) {
                return taken;
            }
            System.out.println("Not a legal move.");
        }
    }

    /** Takes a random legal number of marbles. */
    public static int stupidMove(int pile, Random generator) {
        int max = pile / 2;
        return 1 + generator.nextInt(max);
    }

    /**
     * Takes enough marbles to leave the pile at a power of two minus one,
     * if that's a legal move. Otherwise takes a random legal amount.
     */
    public static int smartMove(int pile, Random generator) {
        int max = pile / 2;

        int target = 1;
        while (target * 2 - 1 < pile) {
            target *= 2;
        }
        int goal = target - 1;

        int taken = pile - goal;
        if (taken >= 1 && taken <= max) {
            return taken;
        }

        return stupidMove(pile, generator);
    }
}
