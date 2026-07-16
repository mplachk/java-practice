/** In a predator-prey simulation, you compute the populations of predators and prey,
 * using the following equations:
 * preyn+1 = preyn × (1 + A – B × predn)
 * predn+1 = predn × (1 – C + D × preyn)
 * Here, A is the rate at which prey birth exceeds natural
 * death, B is the rate of predation, C is the rate at which
 * predator deaths exceed births without food, and D
 * represents predator increase in the presence of food. 
 * Write a program that prompts users for these rates, the initial population sizes, and
 * the number of peri ods. Then print the populations for the given number of periods.
 * As inputs, try A = 0.1, B = C = 0.01, and D = 0.00002 with initial prey and predator
 * populations of 1,000 and 20.
 */

import java.util.Scanner;

/**
 * Simulates predator-prey population changes over a number of periods
 * using the given growth and predation rates.
 */
public class PredatorPrey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A (prey birth rate): ");
        double a = scanner.nextDouble();
        System.out.print("Enter B (predation rate): ");
        double b = scanner.nextDouble();
        System.out.print("Enter C (predator death rate): ");
        double c = scanner.nextDouble();
        System.out.print("Enter D (predator growth rate): ");
        double d = scanner.nextDouble();

        System.out.print("Enter initial prey population: ");
        double prey = scanner.nextDouble();
        System.out.print("Enter initial predator population: ");
        double pred = scanner.nextDouble();

        System.out.print("Enter number of periods: ");
        int periods = scanner.nextInt();

        System.out.println("Period 0: prey = " + prey + ", predators = " + pred);

        for (int period = 1; period <= periods; period++) {
            double nextPrey = prey * (1 + a - b * pred);
            double nextPred = pred * (1 - c + d * prey);

            prey = nextPrey;
            pred = nextPred;

            System.out.println("Period " + period + ": prey = " + prey + ", predators = " + pred);
        }
    }
}
