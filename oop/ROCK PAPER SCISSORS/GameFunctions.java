import java.util.Random;

public class GameFunctions
{
    private Random generator;
    private static String computerChoice;

    public GameFunctions()
    {
        computerChoice = "";
        generator = new Random();
    }

    public void choose()
    {
        int pick = generator.nextInt(3) + 1;

        if (pick == 1)
        {
            computerChoice = "rock";
        }
        else if (pick == 2)
        {
            computerChoice = "paper";
        }
        else
        {
            computerChoice = "scissors";
        }

        System.out.println("The computer chose " + computerChoice + ".");
    }

    public static String whoWon(String userChoice)
    {
        if (userChoice.equals(computerChoice))
        {
            return "tie";
        }
        else if (userChoice.equals("rock") && computerChoice.equals("scissors"))
        {
            return "user";
        }
        else if (userChoice.equals("scissors") && computerChoice.equals("paper"))
        {
            return "user";
        }
        else if (userChoice.equals("paper") && computerChoice.equals("rock"))
        {
            return "user";
        }
        else
        {
            return "computer";
        }
    }
}
