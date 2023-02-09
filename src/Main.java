
import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numberToGuess = (new Random()).nextInt(100);
            System.out.println("Guess the number I made up for you");

            for(int numberOfTries = 1; numberOfTries <= 5; ++numberOfTries) {
                int numberOfTriesLeft = 5 - numberOfTries;
                System.out.print("Your number: ");
                int userNumber = scanner.nextInt();
                if (numberOfTries == 5) {
                    System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                    break;
                }

                System.out.println("Please try again. You have " + numberOfTriesLeft + " more tries");
                if (userNumber == numberToGuess) {
                    System.out.println("You guessed it ");
                    break;
                }

                if (userNumber > numberToGuess) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                } else {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                }
            }
        } catch (Exception var6) {
            System.out.println("You must write a NUMBER");
        }

    }
}
