import java.util.Scanner;

public class RainFallAmounts
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Names used to prompt for and label each month
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                                "July", "August", "September", "October", "November", "December"};

        // Array that will hold the 12 Month objects
        Month[] months = new Month[12];

        for (int i = 0; i < months.length; i++)
        {
            int amount = -1;
            boolean validAmount = false;

            while (!validAmount)
            {
                System.out.print("Please enter the rainfall amount for " + monthNames[i] + ": ");
                amount = scan.nextInt();

                if (amount < 0)
                {
                    System.out.println("Invalid amount. Try again.");
                }
                else
                {
                    validAmount = true;
                }
            }

            months[i] = new Month(monthNames[i], amount);
        }

        // Compute total rainfall
        int total = 0;
        for (int i = 0; i < months.length; i++)
        {
            total += months[i].getAmount();
        }

        // Compute average monthly rainfall
        double average = (double) total / months.length;

        // Find the month with the most and least rain
        Month mostRain = months[0];
        Month leastRain = months[0];

        for (int i = 1; i < months.length; i++)
        {
            if (months[i].getAmount() > mostRain.getAmount())
            {
                mostRain = months[i];
            }

            if (months[i].getAmount() < leastRain.getAmount())
            {
                leastRain = months[i];
            }
        }

        System.out.println();
        System.out.println("The total rainfall is " + total + " inches.");
        System.out.printf("The average monthly rainfall is %.2f inches.%n", average);
        System.out.println("The month with the most rain was " + mostRain.getMonthName() + ".");
        System.out.println("The month with the least rain was " + leastRain.getMonthName() + ".");

        scan.close();
    }
}
