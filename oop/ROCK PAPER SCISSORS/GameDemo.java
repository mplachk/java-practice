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
