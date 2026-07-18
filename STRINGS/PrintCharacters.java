/** Write a program that reads a word and prints each character of the word on a sepa-
 * rate line. For example, if the user provides the input "Harry", the program prints
 * H
 * a
 * r
 * r
 * Y
 */

import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}
