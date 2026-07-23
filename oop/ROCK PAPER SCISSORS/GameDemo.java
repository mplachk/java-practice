/** This is the class that will use the GameFunctions class you created.
 * In the main method:
 * • Instantiate a GameFunctons object.
 * • Prompt the user to enter their choice. Reject any values other than "rock", "paper", or
 *     "scissors" by displaying an error message and prompt the user to re-enter their choice.
 *     • Uppercase/lowercase letters should be ignored.
 * • Call the GameFunctions object's choose method so that is selects the computer's choice.
 * • Pass the user's choice as the argument to the GameFunctions object's whoWon method.
 *     • Based on the String value returned by this method, print the winner.
 * • Ask the user if they would like to play again. If they choose to play again, start the game over from the beginning.
 *     • Allow Y or y to restart the game.
 */

import java.util.Scanner;

public class GameDemo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        GameFunctions game = new GameFunctions();
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y"))
        {
            String userChoice = "";
            boolean validChoice = false;

            while (!validChoice)
            {
                System.out.print("Enter your choice (rock, paper, or scissors): ");
                userChoice = scan.nextLine().toLowerCase();

                if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))
                {
                    validChoice = true;
                }
                else
                {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

            game.choose();
            String result = GameFunctions.whoWon(userChoice);

            if (result.equals("user"))
            {
                System.out.println("You win!");
            }
            else if (result.equals("computer"))
            {
                System.out.println("You lose!");
            }
            else
            {
                System.out.println("It's a tie!");
            }

            System.out.print("Would you like to play again? (Y for yes, N for no): ");
            playAgain = scan.nextLine();
        }

        scan.close();
    }
}
