/**Create a program that plays a game of rock, paper, scissors. Your program should allow the user to 
 * enter "rock", "paper", or "scissors". The program will randomly select "rock", "paper", or
 * "scissors". The winner is then printed.
 * GameFunctions Class (GameFunctions.java)
 * This class should contain the following:
 * • Two private fields.
 *     • generator - A Random object for generating random numbers.
 *         • This field must not be static.
 *     • computerChoice - A String for holding the computer's current choice.
 *         • This field must be static.
 * • One public constructor that accepts no arguments.
 *     • The constructor must assign an empty String to computerChoice field and instantiate a Random object 
 *         for the generator field. Do not give the Random object a seed value.
 * • Two public methods.
 *     • A void method named choose that accepts no arguments.
 *         • When called, the method randomly picks a number between 1, 2 and 3, with each associated with 
 *             "rock", "paper", or "scissors".
 *         • The method then assigns the String value "rock", "paper", or "scissors" to the computer Choice field.
 *         • Finally, the method prints the computer's choice.
 *     • A static method named whoWon that accepts one String argument
 *         • A String passed as to the method as an argument will be the user's choice.
 *         • The function should return a String:
 *             • "user" if the user won
 *             • "computer" if the computer won
 *             • "tie" if neither won.
 *     • Rules for determining the winner:
 *         • Rock beats Scissors
 *         • Scissors beats Paper
 *         • Paper beats Rock
 *         • If the user and computer made the same choice, it's a tie.
*/

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
