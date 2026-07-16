// Write programs that read a line of input as a string and print

import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine();

        System.out.println("Uppercase letters: " + uppercaseLetters(line));
        System.out.println("Every second letter: " + everySecondLetter(line));
        System.out.println("Vowels replaced: " + replaceVowels(line));
        System.out.println("Vowel count: " + countVowels(line));
        System.out.print("Vowel positions: ");
        printVowelPositions(line);
    }

    // a. Only the uppercase letters in the string.
    public static String uppercaseLetters(String line) {
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += ch;
            }
        }
        return result;
    }

    // b. Every second letter of the string.
    public static String everySecondLetter(String line) {
        String result = "";
        for (int i = 1; i < line.length(); i += 2) {
            result += line.charAt(i);
        }
        return result;
    }

    // c. The string, with all vowels replaced by an underscore.
    public static String replaceVowels(String line) {
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (isVowel(ch)) {
                result += "_";
            } else {
                result += ch;
            }
        }
        return result;
    }

    // d. The number of vowels in the string.
    public static int countVowels(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (isVowel(line.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // e. The positions of all vowels in the string.
    public static void printVowelPositions(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (isVowel(line.charAt(i))) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) >= 0;
    }
}